package com.nt.collection.queue;


import java.util.PriorityQueue;

public class PriorityQueuedemo2 {
	public static void main(String[] args) {
		PriorityQueue<Integer>  q1=new PriorityQueue<Integer>();
			//System.out.println(q.element());//RE:NSEE
			//System.out.println(q.peek());//null
			for (int i = 0; i < 10; i++) {
				q1.offer(i);	
			}
		
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
		
	}
}
