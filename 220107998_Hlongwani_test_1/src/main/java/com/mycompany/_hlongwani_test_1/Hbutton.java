/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._hlongwani_test_1;


 
class Hbutton {
    private boolean pressed;
    String nameOfButton;

    Hbutton(String nameOfButton_P) {
        
       nameOfButton=nameOfButton_P;
    }
    
    public void press()
    {
        pressed=true;
    }
}
