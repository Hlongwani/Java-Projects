
package bubblesort;

public class BubbleSort {


    public static void main(String[] args) {
        int array[]={4,5,1,9,2,6,7,3,8};
      
        bubbleSort(array);
        
        for(int i :array){
            System.out.println(i);
        }
       
    }

    private static void bubbleSort(int[] array) {
        
        for(int i=0;i< array.length-1;i++){
            
            for(int j=0;j< array.length-1-i;j++){
                
                if(array[j]> array[j+1]){
                    
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    
}
