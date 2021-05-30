package com.vm.trainee.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WrestlerTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Wrestler> wrest=new ArrayList<Wrestler>();
		wrest.add(new Wrestler("suna",50,(float) 5.4));
		wrest.add(new Wrestler("siri",55,5));
		wrest.add(new Wrestler("krishna",49,6));

		System.out.println(wrest);
		for(Wrestler wrestler:wrest)
		{
			System.out.println(wrestler);
		}
		System.out.println("Wrestler height");
		for(Wrestler wrestler:wrest)
		{
			if(wrestler.getHeight()>5)
			{

				System.out.println(wrestler);
			}
		}
		/**
		 * Description:sorting by name
		 */
		System.out.println("----Sorting by name");
		Collections.sort(wrest,new NameSorting());
		for(Wrestler wrestler:wrest)
		{
			System.out.println(wrestler);
		}
		/**
		 * Description:Sorting by height
		 */

		System.out.println("----Sorting by height");
		Collections.sort(wrest,new HeightSorting());
		for(Wrestler wrestler:wrest)
		{
			System.out.println(wrestler);
		}
		
		
		/**
		 * Description:Sorting by weight
		 */

		System.out.println("----Sorting by weight");
		Collections.sort(wrest,new WeightSorting());
		for(Wrestler wrestler:wrest)
		{
			System.out.println(wrestler);
		}
	}

}
