package com.edu;

interface One{
    void m1();
}

interface Two{
    void m2();
}
//class extends one_class implements inf1,inf2....infn{}
interface Three extends One,Two{
    void m3();
}
class MyClass implements Three{
     public void m1(){
           System.out.println("m1");
      }
  public void m2(){
           System.out.println("m2");
      }
   public void m3(){
            System.out.println("m3");
   }
}
public class MultipleInheritence {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		ob.m1();
		ob.m2();
		ob.m3();

	}

}
