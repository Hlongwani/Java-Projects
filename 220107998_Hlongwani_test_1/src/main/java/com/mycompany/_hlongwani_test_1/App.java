package com.mycompany._hlongwani_test_1;
import javax.swing.JButton;


public class App {

    public static void main(String[] args) {
       Human Mr_Mbatha=new Human();
       Mr_Mbatha.celphone.communicate();
       Telephone tellephone= new Telephone();
       System.out.println("TellePhone Only");
      tellephone.communicate();
      JButton btnOne= new JButton("ESC");
       
    }
}
