package com.vm.trainee.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayIterator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> arraylist=new ArrayList();
		arraylist.add("suna");
		arraylist.add("ghanta");
		arraylist.add("krishna");
		System.out.println(arraylist);
		Iterator it=arraylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Collections.reverse(arraylist);
		for(String str:arraylist)
		{
			System.out.println(str);
		}
	}

}
