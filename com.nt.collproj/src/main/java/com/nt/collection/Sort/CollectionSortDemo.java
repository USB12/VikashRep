package com.nt.collection.Sort;

import java.util.ArrayList;
import java.util.Collections;

class CollectionSortDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Z");
		al.add("A");
		al.add("C");
		al.add("M");
		al.add("K");
		//al.add(new Integer(10));//ClassCastException
		//al.add(null);//NullPointException
		System.out.println("Before Sorting::" + al);
		Collections.sort(al);
		System.out.println("After Sorting::" + al);
	}

}
