package com.vm.trainee.java.oops;

public class Customer {

	
		// TODO Auto-generated method stub
        int id=100;
       private String firstName;
        private String lastName;
        
        
       /* public Customer(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
		System.out.println(id+""+firstName);
	}
        

		public Customer(int id, String firstName, String lastName) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public Customer()
	       {
	    	   System.out.println("hloo");
	       }
		void show()
        {
//        	System.out.println(id+" "+firstName+" "+lastName);
        } */
        
        public Customer() {
        	System.out.println("default");
        }


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}


