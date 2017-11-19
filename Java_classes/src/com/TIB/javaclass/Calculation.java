package com.TIB.javaclass;


	public class Calculation{  
		
		void fact(int  n){  
		  int fact=1;  
		  for(int i=1;i<=n;i++){  
		   fact=fact*i;  
		  }  
		 System.out.println("factorial is "+fact);  
		}  
		public static void main(String args[]){  
			
			Calculation c=new Calculation(),d=new Calculation(), e=new Calculation();
		 new Calculation().fact(5);//calling method with anonymous object  
		}  
		} 

