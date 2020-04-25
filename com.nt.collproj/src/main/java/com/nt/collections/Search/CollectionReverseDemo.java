package com.nt.collections.Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionReverseDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);

		System.out.println(l);
		Collections.sort(l, new MyComparator());
		System.out.println(l);

	}

}
