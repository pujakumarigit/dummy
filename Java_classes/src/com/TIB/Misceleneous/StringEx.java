package com.TIB.Misceleneous;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s11="Hello",s21="Hello1";
		
			String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav"; 
		   String s5="SACHIN";
		   
		  // System.out.println(s1.equalsIgnoreCase(s5));
		   
	String s6=s1.substring(2,5);
	Boolean s8=s1.endsWith("chin");
	char s7=s1.charAt(2);
	
	//System.out.println(s8);
	
	
	String s9="Puja Kumari";
	
	char c[] =s9.toCharArray();
	
	System.out.println(c[10]);
	

	}

}
