package com.TIB.javaclass;

import javax.sound.midi.SysexMessage;

public class First_Class {
	
	public static int method(int i){
		
		System.out.println("Ye hai kuch nhi");
		System.out.println("second line");
		return i;
	}
	
	
	public static void main(String...args){
		System.out.println("Hi Puja");
		
		System.err.println("hi Puja");
		
		int x=method(23);
		
		System.out.println(x);
	}

}
