package com.nt.Collections.Set.HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetGenericDemo {
public static void main(String[] args) {
	LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	lhs.add("vikas");
	lhs.add("raja");
	lhs.add("aru");
	lhs.add("khusi");
	lhs.add("happy");
	lhs.add("dukhi");
	lhs.add("sad");
	lhs.add("10");
	lhs.add("fight");
	lhs.add("null");
	System.out.println(lhs.add("angry"));
	System.out.println(lhs);
}
}
