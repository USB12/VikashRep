package com.nt.collection.Sort;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };
		System.out.println("primitive Arrays before Sorting:::");
		for (int a1 : a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("primitive array after sorting");
		for (int a1 : a) {
			System.out.println(a1);
		}
		String[] s = { "A", "Z", "B" };
		System.out.println("object Arrays before Sorting:::");
		for (String a2 : s) {
			System.out.println(a2);
		}
		Arrays.sort(s);
		System.out.println("object array after sorting");
		for (String a1 : s) {
			System.out.println(a1);
		}
		Arrays.sort(s, new Mycomparator());
		System.out.println("Object Array After sorting by Comparator");
		for (String a1 : s) {

			System.out.println(a1);
		}
	}

}

class Mycomparator implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}