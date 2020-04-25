package com.nt.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuedemo {
	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>(15,new MyComparator());
			
			q.offer("A");
			q.offer("Z");
			q.offer("L");
			q.offer("B");
		
		System.out.println(q);
		
	}
}
class MyComparator implements Comparator<Object>{
	public int compare(Object obj1,Object obj2) {
		String s1=(String) obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
		
	}
}
	