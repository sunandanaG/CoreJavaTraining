
// association using Aggregation

package com.vm.trainee.java.oops;

public class Emp {
	int id;
	String name;
	Address adress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	

}
