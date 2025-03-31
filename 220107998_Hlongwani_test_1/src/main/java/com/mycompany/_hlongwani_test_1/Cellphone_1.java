
package com.mycompany._hlongwani_test_1;


class Cellphone extends Telephone implements H_interface{
     Screen screen=new Screen();
     Hbutton Pbutton=new Hbutton("Power");
     
    @Override
   void communicate()
 {
     super.communicate();
    System.out.println("Communicate with text");
 }
     
}
