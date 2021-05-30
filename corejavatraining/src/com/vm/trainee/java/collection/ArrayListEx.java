package com.vm.trainee.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx
{
	/**
	 * Description: used to print even sum
	 * @param array
	 * @return
	 */
	static int printevensum(ArrayList array)
	{

		Iterator<Integer> it=array.iterator();
		int evensum=0;
		while(it.hasNext())
		{
			if(it.next()%2==0)
			{
				evensum += it.next();
			}
		}

		System.out.println("print even sum:");
		return evensum;

	}
	/**
	 * Description: used to print odd sum
	 * @param array
	 * @return
	 */
	static int printoddsum(ArrayList array)
	{

		Iterator<Integer> it=array.iterator();
		int oddsum=0;
		while(it.hasNext())
		{
			if(it.next()%2==0)
			{
				oddsum += it.next();
			}
		}

		System.out.println("print even sum:");
		return oddsum;

	}
	/**
	 * Description: used to search for an element
	 * @param array
	 * @param key
	 * @return 
	 */
	static boolean search(ArrayList array,Integer key)
	{
		return array.contains(key);
	}
	static ArrayList sort(ArrayList array)
	{
		Collections.sort(array);
		return array;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ob=new ArrayList();
		ob.add(1);
		ob.add(3);
		ob.add(14);
		ob.add(5);
		ob.add(7);
		ob.add(8);
		//		System.out.println(ob);
		if(search(ob,11))
		{
          System.out.println("element is found");
		}
		else
		{
			System.out.println("Element not found");
		}


	}

}
