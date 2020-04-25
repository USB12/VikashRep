package com.nt.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListdemoGeneric3 {
public static void main(String[] args) {
	
	ArrayList<String>al=new ArrayList<String>();
	al.add("A");
	al.add("10");
	al.add("A");
	al.add("10");
	al.add("null");
	System.out.println(al);
al.remove(2);
System.out.println(al);
al.add(2,"V");
al.add("I");
System.out.println(al);
	
}
}
