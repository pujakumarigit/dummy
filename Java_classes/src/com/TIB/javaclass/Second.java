package com.TIB.javaclass;

public class Second {
	
	public static void main(String[] args){
		
		String country="America";
		
		String state="Jharkand";
		
		if(country.equals("india")){
			if(state.equals("Karnataka")){
				System.out.println("Vote now");
			}
			else System.out.println("Please go to your place and vote");
			
			
		}else{
			System.out.println("not eligible for voting");
		}
		
		System.out.println("Country: " +country+ " and state: " +state);
	}

}
