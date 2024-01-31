package com.edu;
interface intf_name{ //all the interface are public

    int k=90;  //public static final int k=90;
//by default interface variables are public static and final
      void meth1();  //public abstract void meth1():
      void meth2();
}

class class_name implements intf_name{
         public  void meth1(){
                System.out.println("method1");
               
                
     }
      public void meth2(){
               System.out.println("method2");
    }
}

public class MainApp{

       public  static void main(String args[]){
    class_name myobj = new class_name();
    myobj.meth1();
   myobj.meth2();
}
    
}