package com.TIB.javaclass;

public class Thiscon{  
Thiscon(){  
this(5);  
System.out.println("hello a");  
}  
Thiscon(int x){  
System.out.println(x);  
}  
 
public static void main(String args[]){  
Thiscon a=new Thiscon();  
}}  
