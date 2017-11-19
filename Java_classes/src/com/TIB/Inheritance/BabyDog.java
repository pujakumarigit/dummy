package com.TIB.Inheritance;

public class BabyDog extends Dog{

	void weep(){System.out.println("weeping...");} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDog bd=new BabyDog();
		
		bd.weep();
		bd.eat();
		bd.bark();
		

	}

}
