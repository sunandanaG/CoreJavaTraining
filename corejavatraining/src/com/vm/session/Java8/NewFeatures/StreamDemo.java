package com.vm.session.Java8.NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	private static final char[] s = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> l=Arrays.asList(1,2,3,4,9,17,7,11);
		ArrayList<Integer> num=new ArrayList();
		num.add(2);
		num.add(3);
		num.add(5);
		num.add(8);
		num.add(1);
		
		System.out.println("print data"+num);
		num.forEach(s->System.out.println("print data"+s));// it is present in collections
		
		
		//TERMINAL OPERATION
		long count=num.stream().count();
		System.out.println("count of values"+count);
		
//		INTERMEDIATE OPERATION
		System.out.println("values greater than 2");
		num.stream().filter(s->s>2).forEach(s->System.out.println("ptint data"+s));
		

	}

}
