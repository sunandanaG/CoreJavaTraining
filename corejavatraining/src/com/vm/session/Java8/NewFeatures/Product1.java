package com.vm.session.Java8.NewFeatures;

 class Product1 
{
	 int pid;
	 int price;
	 String pname;
	 String category;
	 int quantity;
	public Product1(int pid, int price, String pname, String category, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.pname = pname;
		this.category = category;
		this.quantity = quantity;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", pname=" + pname + ", category=" + category
				+ ", quantity=" + quantity + "]";
	}
	 
	 
	
	}
	


