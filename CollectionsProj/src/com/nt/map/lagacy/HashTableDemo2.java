package com.nt.map.lagacy;

import java.util.Hashtable;

public class HashTableDemo2 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new Temp1(5), "A");
		ht.put(new Temp1(3), "B");
		ht.put(new Temp1(12), "C");
		ht.put(new Temp1(15), "D");
		ht.put(new Temp1(21), "E");
		ht.put(new Temp1(16), "F");
		//ht.put("dev", null);
		System.out.println(ht);
	}

}

class Temp1 {
	int i;

	Temp1(int i) {
		this.i = i;

	}

	public int hashCode() {
		return i%9;

	}

	public String toString() {
		return i + "";

	}
}