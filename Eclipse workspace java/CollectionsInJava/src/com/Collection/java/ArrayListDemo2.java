package com.Collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(120);
		list.add(3);
		list.add(40);
		list.add(12);
		System.out.println("Before: "+list);
		/* Collections
		 * it is a utility classes that provides methods to work with collection
		 * */
		//sort
		Collections.sort(list);
		
		System.out.println("After: "+list);
		
		System.out.println("Min value: "+Collections.min(list));
	}
}
