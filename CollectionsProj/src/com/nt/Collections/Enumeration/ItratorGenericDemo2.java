package com.nt.Collections.Enumeration;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorGenericDemo2 {
public static void main(String[] args) {
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for(int i=0;i<=10;i++)
	{
		arr.add(i);
	}
	System.out.println(arr);
	Iterator<Integer> itr=arr.iterator();
	while(itr.hasNext()){
	Integer I=itr.next();
	if(I%2==0)
		System.out.println(I);
	else 
		itr.remove();
	}
	System.out.println(arr);	
	
}
}
