package com.TIB.Misceleneous;

public class WrapperEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		
		String other="12536";
		
		int otherint=Integer.parseInt(other);
		
		Integer ac=Integer.valueOf(a);
		
		String s=ac.toString();
		
		Integer acj=a;
		
		int i=acj.intValue();
		
		System.out.println(a+"       "+ac+"        "+acj+"     "+i);

	}

}
