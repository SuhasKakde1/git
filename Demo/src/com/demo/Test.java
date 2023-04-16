package com.demo;
import java.util.*;
public class Test {

	public static void main(String[] args) {

		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Suhas");
		map.put(12, "Sanjio");
		map.put(13, "Kakde");
		map.put(14, "9767841768");
		
		Set<Integer> set=map.keySet();
		Iterator<Integer> itr =set.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.hasNext());
			System.out.println(itr.next());
			System.out.println(itr0);
		}
		}

}
