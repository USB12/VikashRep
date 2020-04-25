package com.nt.Collections.Set.HashSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo5 {
	public static void main(String[] args) {
		TreeSet<CharSequence> t = new TreeSet<CharSequence>(new MyComparator2());
		t.add("A");
		t.add(new StringBuffer("KK"));
		t.add(new StringBuffer("ZZ"));
		t.add("KK");
		t.add("LLLL");
		t.add("A");
		
		System.out.println(t);

	}

}
class MyComparator2 implements Comparator<Object>{
public int compare(Object obj1,Object obj2)	{
	String s1=obj1.toString();
	String s2=obj2.toString();
	int I1=s1.length();
	int I2=s2.length();
	if(I1<I2)
		return -1;
	else if (I1>I2) 
		return 1;
	else 
	return s1.compareTo(s2);
	
}
}