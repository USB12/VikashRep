package com.nt.Collections.Set.HashSet;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("B");
		t.add("j");
		t.add("d");
		t.add("G");
		t.add("H");
		t.add("null...");
		System.out.println(new Integer(10));
		t.add("null");//1.7v onward null also support
		
		System.out.println(t);
	}
}
