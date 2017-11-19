package com.TIB.javaclass;

public class ObjectOfA4 {

	  int data=10;  
	  
	  ObjectOfA4(){  
		  ObjectOfB b=new ObjectOfB(this);  
	   b.display();  
	  }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectOfA4 a=new ObjectOfA4();
		
		System.out.println(a.data);

	}

}
