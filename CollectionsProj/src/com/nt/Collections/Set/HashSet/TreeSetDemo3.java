package com.nt.Collections.Set.HashSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new MyComparator());
		t.add("Raja");
		t.add("Sona");
		t.add("Mona");
		t.add("Babu");
		System.out.println(t);

	}

}
class MyComparator implements Comparator{
public int compare(Object obj1,Object obj2)	{
	String s1=obj1.toString();
	String s2=(String)obj2;
	//return s2.compareTo(s1);
	return -s1.compareTo(s2);
}
}