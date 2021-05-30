package com.vm.trainee.java.collection;

import java.util.Comparator;

public class NameSorting implements Comparator<Wrestler>
{

	@Override
	public int compare(Wrestler o1, Wrestler o2) 
	{
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());

	}
}
	


