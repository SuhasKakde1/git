package com.example;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Suhas");
		al.add("Kakde");
		al.add(12);
		 for(Object obj:al) {
			 System.out.println(obj);
		 }
	}

}
