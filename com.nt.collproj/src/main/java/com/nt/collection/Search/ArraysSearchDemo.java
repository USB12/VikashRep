package com.nt.collection.Search;

import java.util.Arrays;
import java.util.Arrays.*;
import java.util.Comparator;

public class ArraysSearchDemo {
	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };

		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));

		String[] s1 = { "A", "Z", "B" };
		Arrays.sort(s1);
		System.out.println(Arrays.binarySearch(s1, "Z"));
		System.out.println(Arrays.binarySearch(s1, "S"));

		Arrays.sort(s1, new Mycomparator());
		System.out.println(Arrays.binarySearch(s1,"Z", new Mycomparator()));
		System.out.println(Arrays.binarySearch(s1, "S", new Mycomparator()));
		System.out.println(Arrays.binarySearch(s1, "N", new Mycomparator()));

	}

}

class Mycomparator implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}