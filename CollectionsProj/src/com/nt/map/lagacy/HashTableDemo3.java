package com.nt.map.lagacy;

import java.util.Hashtable;

public class HashTableDemo3 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable(25);
		ht.put(new Temp(5), "A");
		ht.put(new Temp(3), "B");
		ht.put(new Temp(12), "C");
		ht.put(new Temp(15), "D");
		ht.put(new Temp(21), "E");
		ht.put(new Temp(16), "F");
		System.out.println(ht);
	}

}

