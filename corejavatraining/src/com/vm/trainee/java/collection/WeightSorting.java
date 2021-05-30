package com.vm.trainee.java.collection;

import java.util.Comparator;

public class WeightSorting implements Comparator<Wrestler>
{

	@Override
	public int compare(Wrestler o1, Wrestler o2)
	{
		// TODO Auto-generated method stub
		if(o1.getWeight()==o2.getWeight())
		{
			return 0;
		}
		else if(o1.getWeight()>o2.getWeight())
		{
			return 1;
		}
		else
		{
			return -1;
		}

	}
	
}
