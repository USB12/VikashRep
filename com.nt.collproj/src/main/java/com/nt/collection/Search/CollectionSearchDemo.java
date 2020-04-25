package com.nt.collection.Search;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");

		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "J"));
	}

}
