package com.vm.trainee.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> ar=new ArrayList<Product>();
		ar.add(new Product(1,"chocos",1000));
		ar.add(new Product(2,"Ac",400));
		ar.add(new Product(3,"laptop",600));

       System.out.println(ar);
       for(Product product:ar)
       {
    	   System.out.println(product);
       }
      
       
       for(Product product:ar)
       {
    	   if(product.getPrice()>500)
    	   {
    	   System.out.println(product.getPrice());
    	   }
       }
	}

}
