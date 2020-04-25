package com.nt.map.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
	public static void main(String[] args) {

		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("vikas", 100);
		m.put("ankit", 200);
		m.put("sona", 50);
		m.put("shashi", 90);
		m.put("akan", 250);
		m.put("khushi", 70);
		System.out.println(m);
		System.out.println(m.put("shashi", 333));
		Set<String> s = m.keySet();
		System.out.println(s);
		Collection<Integer> c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "---" + m1.getValue());
			if (m1.getKey().equals("vikas")) {
				m1.setValue(101);

			}
		}
		System.out.println(m);
	}

}
