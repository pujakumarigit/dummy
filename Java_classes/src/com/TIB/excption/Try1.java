package com.TIB.excption;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Try1 {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\Puja Kumari\\Desktop\\Doc.txt";
		String pathR="C:\\Users\\Puja Kumari\\Desktop\\Doc1.txt";
		
		try{
			String s;
			//File f=new File(path);
		
			FileReader fr=new FileReader(new File(pathR));
			BufferedReader br=new BufferedReader(fr);
			s=br.readLine();
		
			
			FileWriter fw=new FileWriter(new File(path));
			PrintWriter p=new PrintWriter(fw);
			p.print(s);
			p.close();
			System.out.println("END");
		}catch (NullPointerException e) {
			// TODO: handle exception
					System.err.println("The String is null");
		}catch (FileNotFoundException f ) {
			// TODO: handle exception
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}finally {
			System.out.println("Jo ho jaye");
		}
		

	}

}
