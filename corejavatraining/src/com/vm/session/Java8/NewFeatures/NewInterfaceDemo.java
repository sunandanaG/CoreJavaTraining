package com.vm.session.Java8.NewFeatures;


interface Bank
{
	default void OpenAccount()
	{
		System.out.println("opening the account");
	}
	static void Holiday()
	{
		System.out.println("sunday is an holiday");
	}
	abstract int rateofinterest(int interest);
	abstract int minBalance(int amount);
	
	
}

class Axis implements Bank
{

	@Override
	public int rateofinterest(int interest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int minBalance(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class NewInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank b=new Axis();
        
        b.OpenAccount();
        System.out.println("minimum balance:"+b.minBalance(100));
        
        Bank.Holiday();//the holiday is static method so we should call with class Name
	}

}
