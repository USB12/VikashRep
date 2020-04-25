package com.nt.collection.Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSearchDemo1 {
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
		System.out.println(Collections.binarySearch(l, 10, new MyComparator()));
		System.out.println(Collections.binarySearch(l, 13, new MyComparator()));
		System.out.println(Collections.binarySearch(l, 17, new MyComparator()));
	}

}

class MyComparator implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		return i2.compareTo(i1);

	}
}