package com.vm.trainee.java.collection;

import java.util.Comparator;

public class HeightSorting implements Comparator<Wrestler>
 {

	@Override
	public int compare(Wrestler o1, Wrestler o2) {
		// TODO Auto-generated method stub
		
		if(o1.getHeight()==o2.getHeight())
		{
			return 0;
		}
		else if(o1.getHeight()>o2.getHeight())
		{
			return 1;
		}
		else
		{
			return -1;
		}

	}

}
