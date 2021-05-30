package com.vm.session.Java8.NewFeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class InBuiltFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Predicate <Integer>p=(var1)->var1>2;
       System.out.println(p.test(3));//test is the inbuit method available
       System.out.println(p.test(1));
       
//       For String
       
       Predicate<String>p1=(v1)->v1.startsWith("A");
       System.out.println(p1.test("Apple"));
       
       Function<String,String> f1=(var)->var.concat("hello welcome");
       System.out.println(f1.apply("suna"));
       
       Function<String,Integer> f2=(var)->var.length();
       System.out.println("print data"+f2.apply("suna"));
	}

}
