package com.nt.map.lagacy;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new Temp(5), "A");
		ht.put(new Temp(3), "B");
		ht.put(new Temp(12), "C");
		ht.put(new Temp(15), "D");
		ht.put(new Temp(21), "E");
		ht.put(new Temp(16), "F");
		//ht.put("dev", null);
		System.out.println(ht);
	}

}

class Temp {
	int i;

	Temp(int i) {
		this.i = i;

	}

	public int hashCode() {
		return i;

	}

	public String toString() {
		return i + "";

	}
}