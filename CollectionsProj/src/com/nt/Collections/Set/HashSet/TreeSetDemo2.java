package com.nt.Collections.Set.HashSet;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<StringBuffer> t=new TreeSet<StringBuffer>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("L"));
		System.out.println(t);//RE:ClassCastException
	}

}
