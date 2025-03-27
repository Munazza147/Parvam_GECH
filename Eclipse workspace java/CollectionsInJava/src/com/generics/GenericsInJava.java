package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
	public static void main(String[] args) {
		/*
		 * Generics:
		 * =========
		 * to provide the type safety and to avoid the type casting in 
		 * collection then we should go for generic
		 * syntax:
		 * =======
		 * List<type of object>
		 * */
		
		char [] arr = {'a','b','c'}; //type safety
		char firstEle = arr[0]; // without type casting(not required)
		System.out.println(firstEle);
		
		//without generics
		List arr1 = new ArrayList(); // there is no type safety
		arr1.add(12);
		arr1.add(10.9);
		arr1.add("Hello");
		int value = (int) arr1.get(0); // explict type casting
		System.out.println(value);
		
		//generics
		List<Integer> list = new ArrayList<>(); //type safety
		list.add(12);
		list.add(120); //1
		//list.add(10.67);
		int a = list.get(1); //there is no concept of type casting
		System.out.println(a);
		System.out.println(list);
		
		
	}
}
