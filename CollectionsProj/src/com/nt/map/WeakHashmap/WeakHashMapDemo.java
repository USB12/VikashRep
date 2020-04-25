package com.nt.map.WeakHashmap;

import java.util.HashMap;
import java.util.Properties;

import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;

public class WeakHashMapDemo {
	public static void main(String[] args) throws Exception {

		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "vikas");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}

class Temp {
	public String toString() {
		return "temp";

	}

	public void finalize() {
		System.out.println("finalize() method called");

	}
}
