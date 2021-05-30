package com.vm.trainee.java.concurrency;

import java.util.HashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String ,Integer>();
		hm.put("suna",05);
		hm.put("siri", 20);
		hm.put("krishna",30);
		System.out.println("elements in hashmap"+hm);
		
		for(Integer val:hm.values())
		{
			System.out.println(val);
			hm.computeIfAbsent("dhana", a->90);
		}
		System.out.println("added elements on map"+hm);

//		System.out.println(hm.containsKey(30));
	}

}
