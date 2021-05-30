package com.vm.trainee.java.oops;

public class GrandFather {
	int age=70;
	public GrandFather(int age) {
		this.age=age;
	}
	void walk() {
		System.out.println("I can't walk fast"+age);
		}
}
class Father extends GrandFather{
	int myAge;
	public Father(int age,int myAge) {
		super(age);
		this.myAge=myAge;
	}
void walk() {
	System.out.println("I can walk fast"+myAge);
	
}
}
class Son extends Father{
	int myTeenAge;
	public Son(int age,int myAge,int myTeenAge){
	super(age,myAge);
	this.myTeenAge=myTeenAge;
}
	void walk() {
		System.out.println("I can run"+myTeenAge);;
}
}
