package com.nt.Collections.Set.HashSet;

import java.util.HashSet;

public class HashSetGenericDemo {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<String>();
	hs.add("vikas");
	hs.add("raja");
	hs.add("aru");
	hs.add("khusi");
	hs.add("happy");
	hs.add("dukhi");
	hs.add("sad");
	hs.add("10");
	hs.add("fight");
	hs.add("null");
	System.out.println(hs.add("angry"));
	System.out.println(hs);
}
}
