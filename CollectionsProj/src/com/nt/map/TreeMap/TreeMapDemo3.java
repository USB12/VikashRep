package com.nt.map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo3 {

	public static void main(String[] args) {

		TreeMap t = new TreeMap(new MyComparator());
		t.put("ZZZ", 10);
		t.put("AAA", 20);
		t.put("XXX", 30);
		t.put("LLL", 40);

		System.out.println(t);

	}

}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);

	}

}