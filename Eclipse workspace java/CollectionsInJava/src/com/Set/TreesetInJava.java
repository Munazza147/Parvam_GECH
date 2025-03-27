package com.Set;

import java.util.TreeSet;

public class TreesetInJava {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>((a,b)->b-a);
		treeSet.add(2);
		treeSet.add(10);
		treeSet.add(100);
		treeSet.add(12);
		System.out.println(treeSet);
	}
}
