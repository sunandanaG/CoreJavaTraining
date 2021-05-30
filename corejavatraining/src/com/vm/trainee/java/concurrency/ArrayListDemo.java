package com.vm.trainee.java.concurrency;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ob=new ArrayList<Integer>();
		ob.add(21);
		ob.add(12);
		ob.add(32);

		System.out.println("list elements are:"+ob);
		for(Integer i:ob)
		{
			System.out.println(i);
			ob.add(20);// already we are using ob in arraylist so this cannot be added
		}
	}
}


