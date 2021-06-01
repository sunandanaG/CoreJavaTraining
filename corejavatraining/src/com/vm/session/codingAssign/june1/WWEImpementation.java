package com.vm.session.codingAssign.june1;

import java.util.ArrayList;

public class WWEImpementation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<WWE> ar=new ArrayList<WWE>();
		
		ar.add(new WWE("Hello","ghanta",50));
		ar.add(new WWE("kumar","hi",100));
		ar.add(new WWE("siri","vinni",150));
		ar.add(new WWE("krishna","rama",250));
		ar.add(new WWE("welcome","java",350));
		
		
		//to count number of wrestlers
		long count=ar.stream().count();
		System.out.println("count of values:"+count);
		
		//sum of all weight of all wrestlers whose weight is above 200
		
		System.out.println("sum of all weight of all wrestlers whose weight is above 200");
		System.out.println(ar.stream().filter(s->s.getWeight()>200).count());
		
		
		
		
		

	}

}
