package com.vm.trainee.java.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        ArrayList ob=new ArrayList();
        System.out.println(ob.size());
        ob.add(1);
        ob.add("sachin");
        ob.add(23.45);
        System.out.println("after add to the list:"+ob.size());
        System.out.println(ob.remove(1));
        System.out.println("after removing"+ob);
        
	}

}
