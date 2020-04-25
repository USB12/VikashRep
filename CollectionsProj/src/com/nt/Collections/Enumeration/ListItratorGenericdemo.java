package com.nt.Collections.Enumeration;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItratorGenericdemo {
public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("vikas");
	l.add("ank");
	l.add("banti");
	l.add("manish");
	l.add("anshu");
	System.out.println(l);
	ListIterator<String> ltr=l.listIterator();
	while (ltr.hasNext()) {
	String s=ltr.next();
	if(s.equals("ank"))	{
		ltr.remove();
	}
	else if (s.equals("banti")) {
	ltr.add("gold");	
	}
	else if (s.equals("manish")) {
		ltr.set("Aru");
	}
	}
	System.out.println(l);
}
}
