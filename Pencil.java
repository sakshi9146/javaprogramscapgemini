package com.edu;

public class Pencil extends Stationary {

	Pencil(){
		super(10,20);
		System.out.println("this is pencil");
	}
	public void simplePencil() {
		System.out.println("this is simple pencil");
		Stationary s = new Stationary();
		s.notebook();
	}
	public void colorPencil() {
		System.out.println("This is colord pencil");
		Stationary s = new Stationary();
		s.erasor();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pencil p = new Pencil();
		//p.simplePencil();
		//p.colorPencil();
	}

}
