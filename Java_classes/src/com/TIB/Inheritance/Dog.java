package com.TIB.Inheritance;

public class Dog extends Animal {
	
	Dog(){
		System.out.println("Barking");
	}
	

	
	final int rollno=25;
	
	public void method(){
		super.eat();
		System.out.println(super.rollno);
	
	}

	void bark(){
		System.out.println("Barking");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		d.eat();
	

	}

}
