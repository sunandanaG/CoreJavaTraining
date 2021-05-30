
package com.vm.session.Java8.NewFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> ar=new ArrayList();

		ar.add(new Employee(1,"suna","cse",50000,25));
		ar.add(new Employee(2,"siri","dev",27000,28));
		ar.add(new Employee(3,"krishna","ece",30000,32));
		ar.add(new Employee(4,"john","test",32000,45));
		ar.add(new Employee(5,"sanvi","hr",80000,40));

		ar.forEach(System.out::println);

		long count=ar.stream().count();
		System.out.println("count of employees is :"+count);

		System.out.println(" print only developer");
		ar.stream().filter(s->s.getDept().equalsIgnoreCase("dev")).forEach(s->System.out.println(s));
		
		


		System.out.println("print the details that starts with s");

		ar.stream().filter(s->s.getName().startsWith("s")).forEach(s->System.out.println(s));
		
		System.out.println("count the employees salary greater than 50000");
		
		System.out.println(ar.stream().filter(s->s.getSalary()>50000).count());
		
		System.out.println("print the employee name length");
	ar.stream().map(m->m.getId()+" "+m.getName()+" "+m.getName().length()).forEach(s->System.out.println(s));
	
	System.out.println("increase 20% of salary");
	ar.stream().map(m->m.getSalary()*0.20+m.getSalary()+" "+m.getName()+" "+m.getName().length()).forEach(System.out::println);
	
	List<Employee> sp=  ar.stream().sorted((p1,p2)->
	{
		return p1.getName().compareTo(p2.getName());
	}).collect(Collectors.toList()); 
	sp.forEach(System.out::println);

System.out.println("sort by salary");
ar.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

System.out.println("sort by salary and reverse");
ar.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

System.out.println("sort the string and reverse");
ar.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

System.out.println("distinct values");
ar.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

System.out.println("total salary of hr");
long su=ar.stream().filter(s->s.getDept().equals("hr")).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
System.out.println(su);

System.out.println("skipvalues");
ar.stream().skip(2).collect(Collectors.toList()).forEach(System.out::println);

System.out.println("distinct values");
ar.stream().limit(1).collect(Collectors.toList()).forEach(System.out::println);

	
	
}
}
