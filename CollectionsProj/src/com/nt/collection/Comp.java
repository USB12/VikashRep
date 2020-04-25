package com.nt.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Comp {

	public static void main(String[] args) {

		Employees e1 = new Employees("raja", 100);
		Employees e2 = new Employees("sona", 200);
		Employees e3 = new Employees("janu", 50);
		Employees e4 = new Employees("rani", 150);
		Employees e5 = new Employees("raja", 100);
		TreeSet<Employees> t = new TreeSet<Employees>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);

		TreeSet<Employees> t1 = new TreeSet<Employees>(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);

	}

}

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		Employees e1 = (Employees) obj1;
		Employees e2 = (Employees) obj2;

		String s1 = e1.name;
		String s2 = e2.name;
		return s2.compareTo(s1);
	}
}
