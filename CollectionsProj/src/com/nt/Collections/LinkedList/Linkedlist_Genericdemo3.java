package com.nt.Collections.LinkedList;

import java.util.LinkedList;

public class Linkedlist_Genericdemo3 {
public static void main(String[] args) {
	LinkedList<String> l=null;
	l=new LinkedList<String>();
	l.add("vikas");
	l.add("23");
	l.add("null");
	l.set(0,"soft");
	l.add(0,"ank");
	l.removeLast();
	l.add("Ank");
	
	System.out.println(l);
	l.getFirst();
	System.out.println(l);
	l.getLast();
	System.out.println(l);
	l.addFirst("Vikas");
	System.out.println(l);
	l.addLast("engg");
	System.out.println(l);
	l.remove(4);
	System.out.println(l);
	}
}
