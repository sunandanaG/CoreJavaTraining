package com.vm.trainee.java.concurrency;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapIteration 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//when we want to iterate the map 
       //keyset-->keys
		//values-->values
		//entryset-->both key and values
		HashMap<String,Integer> hm=new HashMap<String ,Integer>();
		hm.put("suna",05);
		hm.put("siri", 20);
		hm.put("krishna",30);
	
		for(Entry<String,Integer> h:hm.entrySet())
		{
			System.out.println(h);
		}
		
		for(Integer i:hm.values())
		{
			System.out.println(i);
		}
		
		for(String k:hm.keySet())
		{
			System.out.println("keys:"+k+" "+hm.get(k));
		}
	}

}
