package com.nt.collection.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CollectionSortDemo2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Z");
		al.add("A");
		al.add("C");
		al.add("M");
		al.add("K");

		System.out.println("Before Sorting::" + al);
		Collections.sort(al, new MyComparator());
		System.out.println("After Sorting::" + al);
	}

}

class MyComparator implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}