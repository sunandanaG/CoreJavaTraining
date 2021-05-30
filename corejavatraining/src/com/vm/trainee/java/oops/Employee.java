package com.vm.trainee.java.oops;

public class Employee {
	int empid;
	private String ename;
	private String edept;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	
	
	/*public Employee(int empid,String ename,String edept)
	{
		this.empid=empid;
		this.ename=ename;
		this.edept=edept;
	}
void show()
{
	System.out.println(empid+" "+ename+" "+edept);
}*/
}
