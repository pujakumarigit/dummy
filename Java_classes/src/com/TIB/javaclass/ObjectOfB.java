package com.TIB.javaclass;

public class ObjectOfB {

	  ObjectOfA4 obj; 
	  
	  ObjectOfB(ObjectOfA4 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  

}
