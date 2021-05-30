package com.vm.trainee.java.collection;

public class Wrestler 
{
	String name;
	int weight;
	float height;
	public Wrestler(String name, int weight, float height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Wrestler [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
	

}
