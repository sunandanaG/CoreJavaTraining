package com.vm.trainee.java.oops;

public class PersonCom {
                           //using composition
	int id;
	String fName;
	String lName;
	Address address;
	
	
	PersonCom()
	{
		address =new Address();// person is whole and address is part
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	@Override
	public String toString() {
		return "PersonCom [id=" + id + ", fName=" + fName + ", lName=" + lName + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
