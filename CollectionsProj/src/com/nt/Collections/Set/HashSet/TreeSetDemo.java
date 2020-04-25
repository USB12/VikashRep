package com.nt.Collections.Set.HashSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		//TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);// +ve compare(0,10)
		t.add(12);// -ve compare(12,10)
		t.add(15);//
		t.add(20);
		t.add(8);

		System.out.println(t);
	}
}
//
//class MyComparator implements Comparator {
//
//	public int compare(Object obj1, Object obj2) {
//		Integer I1 = (Integer) obj1;
//		Integer I2 = (Integer) obj2;
//
//		if (I1 < I2)
//			return +1;
//		else if (I2 > I1)
//			return -1;
//		else
//			return 0;
//
//	}
//}