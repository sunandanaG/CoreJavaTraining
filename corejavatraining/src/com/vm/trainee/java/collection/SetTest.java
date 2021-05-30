package com.vm.trainee.java.collection;

import java.util.*;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


}
class EmployeeDetails extends Employee
{
	String Address;
	String Pancard;
	public EmployeeDetails(int id, String name, String address, String pancard)
	{
		super(id, name);
		Address = address;
		Pancard = pancard;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [Address=" + Address + ", Pancard=" + Pancard + "]";
	}

}

public class SetTest 
{

	public static void main(String[] args) 

	{

		HashMap hashmap=new HashMap();
		hashmap.put(100,"suna");
		
		
		
//    ArrayList<Employee> arraylist =new ArrayList<>();
//    arraylist.add(new Employee(100,"suna"));
//    
//    System.out.println(arraylist);
//    arraylist.add(new EmployeeDetails(1001,"suna","Eastgodavari","Dhjpg6764R"));
//    System.out.println(arraylist);
		
//		HashSet<String> hs = new HashSet<String>();
//		//add elements to HashSet
//		hs.add("first");
//		hs.add("second");
//		hs.add("third");
//		hs.add("apple");
//		hs.add("rat");
//		System.out.println(hs);
//
//		HashSet<String> subSet = new HashSet<String>();
//		subSet.add("rat");
//		subSet.add("second");
//		subSet.add("first");
//		hs.retainAll(subSet);
//		hs.clear();
		
		

//	System.out.println(hs);
	}

}








//TODO Auto-generated method stub
		// HashSet set=new HashSet();
		// set.add("suna");
		// set.add("ghanta");
		// set.add("10000");
		// System.out.println(set);// it prints the output in lexicographical order
		// 
		// TreeSet treeset=new TreeSet();
		//		 
		//	        treeset.add("hi");
		//	        treeset.add("1200");
		//	        treeset.add("welcome");
		//	      System.out.println(treeset);
