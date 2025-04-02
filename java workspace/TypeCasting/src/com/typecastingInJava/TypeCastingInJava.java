package com.typecastingInJava;

public class TypeCastingInJava {
	public static void main(String[] args) {
		/*
		 * Type casting:
		 * =============
		 * conversion of one data type to another
		 * 
		 * 1. implicit type casting:
		 * =========================
		 * byte -> short -> int -> long -> float -> double
		 * 
		 * 2. explicit type casting:
		 * =========================
		 * double -> float -> long -> int -> short -> byte
		 * 
		 * */
		//1. implicit type casting
		int a = 10;
		long a2 = a;
		
		System.out.println("Int : "+a);
		System.out.println("Long : "+a2);
		
		//1. explicit type casting
		long a3 = 10;
		int a4 = (int)a3;
		
		System.out.println("Int : "+a4);
		System.out.println("Long : "+a3);
	}
}
