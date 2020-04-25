package com.nt.Collections.LinkedList;

import java.util.LinkedList;

public class Linkedlistdemo {
public static void main(String[] args) {
	LinkedList l=null;
	l=new LinkedList();
	l.add("vikas");
	l.add("23");
	l.add("null");
	l.set(0,"soft");
	l.add(0,"ank");
	l.removeLast();
	l.add("Ank");
	
	System.out.println(l);
	
	}
}
