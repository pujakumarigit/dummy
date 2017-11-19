package com.TIB.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collect {

	public static void main(String[] args) {

		List l = new ArrayList();
		List l2=new LinkedList<>();
		Set s=new HashSet();

		//Adding elements to list
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		//Adding elements to Set
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		
		System.out.println(l.contains("A"));
		//l.remove("A");
		
		//System.out.println("Printing List");
		
		for(int i=0;i<=l.size()-1;i++){
			//System.out.println(l.get(i));
		}
		
		//System.out.println("Printing Set");
		
		for(int k=0;k<=l.size()-1;k++){
			//System.out.println(l.get(k));
		}
	}

}
