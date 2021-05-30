package com.vm.session.Java8.NewFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.vm.trainee.java.collection.Product;


public class ProductStream 
{
	// COUNT OF PRODUCTS
	static long countofproducts(ArrayList<Product1>pro)
	{
		return pro.stream().count();
		
	}
	
	// COUNT OF PRODUCT PRICE GREATER THAN 4000
	static long countproductpricegreater(ArrayList<Product1>pro)
	{
		return pro.stream().filter(s->s.getPrice()>4000).count();
		
	}
	
//	MAKE PRODUCTNAME TO UPPERCASE
	
	static List<String> productnametouppercase(ArrayList<Product1>pro)
	{
		return pro.stream().map(m->m.getPname().toUpperCase()).collect(Collectors.toList());
		
	}

//	CATEEGORY BY PRODUCT
	
	static List<Product1> categorybyproduct(ArrayList<Product1>pro)
	{
		return pro.stream().filter(s->s.getCategory().equals("food")).collect(Collectors.toList());
		
	}
	

	
	 public static void main(String[] args) {
	  
		 ArrayList <Product1> product=new ArrayList<Product1>();
		 
		 product.add(new Product1(1, 50000, "mobile", "electronics", 10));
		 product.add(new Product1(2, 32000, "tv", "electronics", 3));
		 product.add(new Product1(3, 25000, "ac", "electronics", 10));
		 product.add(new Product1(4, 45000, "beds", "furniture", 2));
		 product.add(new Product1(5, 85000, "sofa", "furniture", 3));
		 product.add(new Product1(6, 3500, "elephantdoll", "toys", 3));
		 product.add(new Product1(7, 5000, "chocolates", "food", 20));
		 product.add(new Product1(8, 3000, "walfy", "food", 15));
		 
		 
		 
		 System.out.println("count of the products:"+countofproducts(product));
		 
		 System.out.println("count the products greater than 4000:"+countproductpricegreater(product));
		 
		 System.out.println("product name uppercase:"+productnametouppercase(product));
		 
   	 System.out.println("category by the products:"+categorybyproduct(product));
      
	 
	 
	 }
		
}


