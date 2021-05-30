package com.vm.trainee.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAsses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> javabatch=new ArrayList();
javabatch.add("ravi");
javabatch.add("john");
javabatch.add("anil");
javabatch.add("kumar");

System.out.println("print javabatch:"+javabatch);
ArrayList<String> sqlbatch=new ArrayList();
sqlbatch.add("sourav");
sqlbatch.add("ankita");
sqlbatch.add("john");
sqlbatch.add("kumar");
sqlbatch.add("manoj");

System.out.println("print sqlbatch:"+sqlbatch);

javabatch.removeAll(sqlbatch);
javabatch.addAll(sqlbatch);
System.out.println("after adding :"+javabatch);

Collections.sort(javabatch);
System.out.println(javabatch);
	}

}
