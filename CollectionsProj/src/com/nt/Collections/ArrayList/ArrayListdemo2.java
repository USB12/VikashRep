package com.nt.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListdemo2 {
public static void main(String[] args) {
	
	ArrayList al=null;
	al=new ArrayList();
	al.add("A");
	al.add("10");
	al.add("A");
	al.add("10");
	al.add("null");
	System.out.println(al);
al.remove(2);
System.out.println(al);
al.add(2,"V");
al.add("n");
System.out.println(al);
	
}
}
