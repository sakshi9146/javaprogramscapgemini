package com.edu;

public class ConstructorThis {
	ConstructorThis()
    {
        this(0);
        
        System.out.println("Default");
    }
	ConstructorThis(int a)
    {
	
    this(1,2);
    System.out.println("First");
    }

	ConstructorThis(int a,int b)
    {
        this(4, 5, 7);
        System.out.println("Second");

    }
	ConstructorThis(int a, int b, int c)
    {
     System.out.println("Third");
    }
    public static void main(String[] args) {
    	ConstructorThis a=new ConstructorThis();
        
	

	}

}
