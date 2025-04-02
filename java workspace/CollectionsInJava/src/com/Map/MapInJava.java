package com.Map;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {
	public static void main(String[] args) {
		/* Map:
		 * ====
		 *  When you represent a group of individual object as a single entity 
		 *  in  the form of key value pair then we should for map interface
		 * */
		Map<Integer, String> map = new HashMap<>(); 
		map.put(1, "One");
		map.put(1, "Ten");
		map.put(2, "Two");
		map.put(3, "Three");
		System.out.println(map);
		map.remove(3);
		System.out.println(map);
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Two"));
	}
}
