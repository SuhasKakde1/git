package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Suhas");
		list.add("Sanjio");
		list.add("kakde");
		for(String str: list) {
			System.out.println(str);
		}
		
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
