package com.edu.java8features;

interface Addition{
	void add();
}

/*class MyClass implements Addition{
	public void add(){
		System.out.println("Addition");

	}
}
*/
interface Subtract{
	void sub();
}
interface Multiply{
	void mul();
}
interface Division{
	void div();
}
public class MainApp {

	public static void main(String[] args) {
		
		//inner class
		Addition ob = new Addition() {

			@Override
			public void add() {
				System.out.println("Add method");
				
			}
			
		};
		ob.add();
		//Lambda Expresion for function with no arguement and no return type
		
		Addition ob0=()->{
			System.out.println("Additon Method with Lambda Express");
		};
		ob0.add();
		Subtract ob1 = new Subtract() {

			@Override
			public void sub() {
				System.out.println("Sub method");
				
			}
			
		};
		ob1.sub();
		//lambda Expression
		Subtract sob=()->{
			System.out.println("Subtraction method");
		};
		sob.sub();
		Multiply ob2 = new Multiply() {

			@Override
			public void mul() {
				System.out.println("Multiply method");
				
			}
			
		};
		ob2.mul();
		
		Division ob3 = new Division() {

			@Override
			public void div() {
				System.out.println("Division method");
				
			}
			
		};
		ob3.div();
	}

}
