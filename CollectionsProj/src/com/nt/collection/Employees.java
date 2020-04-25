package com.nt.collection;

public class Employees implements Comparable {
	String name;
	int eid;

	public Employees(String name, int eid) {

		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + "----" + eid;
	}

	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employees e = (Employees) obj;
		int eid2 = e.eid;
		if (eid1 < eid2) {
			return -1;

		} else if (eid1 > eid2) {
			return 1;

		} else
			return 0;

	}
}