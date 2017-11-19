package com.TIB.javaclass;

public class StaticEx extends Staticadd {
	
	public void add(){
		System.out.println("Static Ex: Adding done");
	}
	
	public void addtwice(){
		add();
	}
	
	
public static void main(String[] args){
	
	StaticEx e=new StaticEx();
	
	e.addtwice();
	
}

}
