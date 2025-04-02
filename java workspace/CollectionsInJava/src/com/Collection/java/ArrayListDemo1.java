package com.Collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(3);
		list.add(12);
		//1. for loop
		for(int i = 0 ; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//2. for each
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		//3. forEach
		list.forEach(i->System.out.print(i+" "));
		System.out.println();
		//4. iterator
		Iterator<Integer> itr =  list.iterator();
		while(itr.hasNext()) {
			//int i = itr.next();
			System.out.print(itr.next()+" ");
		}
	}
}
