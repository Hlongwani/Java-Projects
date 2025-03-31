/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NKAVELO
 */
public class Array3 {

    public static void main(String[] args) {
    int input;
    int[] Array = new int[100];
    Random value = new Random();
    for(int i=0;i<Array.length;i++){
    Array[i]= value.nextInt(100);
}
    for( int i=0;i<Array.length;i++){
        System.out.println(Array[i]) ;
       }
    
      }
    
    
    
    
    
    
 static int SearchValue(int[] Array,int input){
  System.out.println("Which value do you want to search for ?");
  Scanner in = new Scanner(System.in);
  input=in.nextInt();
 for(int i=0;i<Array.length;i++) {
  if(Array[i]==input)   {
     System.out.println("Value found"); 
      return i;
  }
  else{
      System.out.println("Value not found");
  }
  }
 return -1;
 }
 static int DuplicateValue(){
  int i=0;   
    return i; }
}
    

