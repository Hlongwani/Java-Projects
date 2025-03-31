package javaapplication11; 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

class Tetromino {
    private static final int[][][] SHAPES = {
        {{1, 1, 1, 1}},  // I shape
        {{1, 1}, {1, 1}},  // O shape
        {{0, 1, 0}, {1, 1, 1}},  // T shape
        {{0, 1, 1}, {1, 1, 0}},  // S shape
        {{1, 1, 0}, {0, 1, 1}},  // Z shape
        {{1, 1, 1}, {1, 0, 0}},  // J shape
        {{1, 1, 1}, {0, 0, 1}}  // L shape
    };

    private int type;
    private int rotation;

    public Tetromino(int type) {
        this.type = type;
        this.rotation = 0;
    }

    public int[][] getShape() {
        int[][] shape = SHAPES[type];
        for (int r = 0; r < rotation; r++) {
            shape = rotateClockwise(shape);
        }
        return shape;
    }

    public void rotate() {
        rotation = (rotation + 1) % 4;
    }

    private int[][] rotateClockwise(int[][] shape) {
        int rowCount = shape.length;
        int colCount = shape[0].length;
        int[][] rotated = new int[colCount][rowCount];
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                rotated[col][rowCount - 1 - row] = shape[row][col];
            }
        }
        return rotated;
    }

    public int getType() {
        return type;
    }

    public int getRotation() {
        return rotation;
    }
}

class GameGrid {
    private int[][] grid;

    public GameGrid(int width, int height) {
        grid = new int[height][width];
    }

    public int getWidth() {
        return grid[0].length;
    }

    public int getHeight() {
        return grid.length;
    }

    public int getValue(int x, int y) {
        return grid[y][x];
    }

    public void setValue(int x, int y, int value) {
        grid[y][x] = value;
    }

    public boolean isRowFull(int y) {
        for (int x = 0; x < getWidth(); x++) {
            if (grid[y][x] == 0) {
                return false;
            }
        }
        return true;
    }

    public void clearRow(int y) {
        for (int x = 0; x < getWidth(); x++) {
            grid[y][x] = 0;
        }
        for (int row = y; row > 0; row--) {
            System.arraycopy(grid[row - 1], 0, grid[row], 0, getWidth());
        }
    }

    public boolean canPlaceTetromino(Tetromino tetromino, int x, int y) {
        int[][] shape = tetromino.getShape();
        for (int row = 0; row < shape.length; row++) {
            for (int col = 0; col < shape[row].length; col++) {
                if (shape[row][col] != 0) {
                    int gridX = x + col;
                    int gridY = y + row;
                    if (gridX < 0 || gridX >= getWidth() || gridY < 0 || gridY >= getHeight()) {
                        return false;
                    }
                    if (grid[gridY][gridX] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void placeTetromino(Tetromino tetromino, int x, int y) {
        int[][] shape = tetromino.getShape();
        for (int row = 0; row < shape.length; row++) {
            for (int col = 0; col < shape[row].length; col++) {
                if (shape[row][col] != 0) {
                    grid[y + row][x + col] = tetromino.getType() + 1;
                }
            }
        }
    }
}

public class TetrisGame extends JFrame implements ActionListener {
    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 20;
    private static final int BLOCK_SIZE = 30;

    private GameGrid grid;
    private Tetromino currentTetromino;
    private int currentX, currentY;
    private Timer timer;

    public static JButton left_btn;
    public static JButton right_btn;
    public static JButton down_btn;
    public static JButton rotate_btn;

    public TetrisGame() {
        grid = new GameGrid(GRID_WIDTH, GRID_HEIGHT);
        timer = new Timer(500, this);
        timer.start();
        spawnNewTetromino();

        setTitle("Tetris");
        setSize(GRID_WIDTH * BLOCK_SIZE + 20, GRID_HEIGHT * BLOCK_SIZE + 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.setBackground(Color.yellow);

        initControls();
    }

    public void initControls() {
        left_btn = new JButton("<<");
        right_btn = new JButton(">>");
        down_btn = new JButton("Down");
        rotate_btn = new JButton("Rotate");

        left_btn.setBounds(50, 600, 60, 30);
        right_btn.setBounds(120, 600, 60, 30);
        down_btn.setBounds(190, 600, 80, 30);
        rotate_btn.setBounds(280, 600, 80, 30);

        left_btn.addActionListener(e -> moveTetromino(-1, 0));
        right_btn.addActionListener(e -> moveTetromino(1, 0));
        down_btn.addActionListener(e -> moveTetromino(0, 1));
        rotate_btn.addActionListener(e -> rotateTetromino());

        setLayout(null);
        add(left_btn);
        add(right_btn);
        add(down_btn);
        add(rotate_btn);
    }

    private void spawnNewTetromino() {
        currentTetromino = new Tetromino((int) (Math.random() * 7));
        currentX = GRID_WIDTH / 2 - 1;
        currentY = 0;

        if (!grid.canPlaceTetromino(currentTetromino, currentX, currentY)) {
            timer.stop();
            System.out.println("Game Over");
        }
    }

    private void moveTetromino(int dx, int dy) {
        int newX = currentX + dx;
        int newY = currentY + dy;

        if (grid.canPlaceTetromino(currentTetromino, newX, newY)) {
            currentX = newX;
            currentY = newY;
            repaint();
        } else if (dy == 1) {
            grid.placeTetromino(currentTetromino, currentX, currentY);
            clearFullRows();
            spawnNewTetromino();
        }
    }

    private void rotateTetromino() {
        currentTetromino.rotate();
        if (!grid.canPlaceTetromino(currentTetromino, currentX, currentY)) {
            for (int i = 0; i < 3; i++) {
                currentTetromino.rotate();
            }
        }
        repaint();
    }

    private void clearFullRows() {
        for (int y = 0; y < GRID_HEIGHT; y++) {
            if (grid.isRowFull(y)) {
                grid.clearRow(y);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int y = 0; y < GRID_HEIGHT; y++) {
            for (int x = 0; x < GRID_WIDTH; x++) {
                if (grid.getValue(x, y) != 0) {
                    g.fillRect(x * BLOCK_SIZE + 10, y * BLOCK_SIZE + 30, BLOCK_SIZE, BLOCK_SIZE);
                }
            }
        }

        int[][] shape = currentTetromino.getShape();
        for (int row = 0; row < shape.length; row++) {
            for (int col = 0; col < shape[row].length; col++) {
                if (shape[row][col] != 0) {
                    g.fillRect((currentX + col) * BLOCK_SIZE + 10, (currentY + row) * BLOCK_SIZE + 30, BLOCK_SIZE, BLOCK_SIZE);
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            moveTetromino(0, 1);
        }
    }

    public static void main(String[] args) {
        new TetrisGame();
    }
}
