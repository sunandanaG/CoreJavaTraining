package com.vm.trainee.java.assignment;

public class Hdfc implements Bank
{

	int balance;
	 int minBalance;
	 int withdrawl;
	 public void AccountBalance(int balance,int minBalance,int withdrawl) {
	  this.balance=balance;
	  this.minBalance=minBalance;
	  this.withdrawl=withdrawl;
	 }
	 void withdrawing()
	 {
	  try
	  {
	  if(balance>minBalance&&(balance-minBalance)>(minBalance+200))
	  {
	   System.out.println("After withdrawing Balance:"+(balance-withdrawl));
	   
	  }
	  else
	  {
	    throw new MaintainingMinimumBalanceException("You are maintining your minimum balance");
	  }
	  
	  if(balance>minBalance&&balance-minBalance>minBalance)
	  {
	   System.out.println("After withdrawing Balance:"+(balance-withdrawl));
	   }
	  else
	  {
	     throw new AverageMonthlyBalanceException("Charges are More when balance is less than 10000");
	  }
	  if(balance-withdrawl<=minBalance)
	  {
	   throw new BalanceIsLowException("The Amount tour trying to withdraw is making your bank balance lower than min balance so you can not withdraw that much amount");
	  }
	  else
	  {
	    System.out.println("Yes you can withdraw amount what you enterd");
	  }
	  if(balance<minBalance)
	  {
	   throw new MoneyCantWithdrawException("Your balance is less than so your account on hold ");
	  }
	  else
	  {
	    System.out.println("Your account is Active");
	  }
	  }
	  catch (MaintainingMinimumBalanceException e1) {
	   e1.printStackTrace();
	  }
	  catch (AverageMonthlyBalanceException e2) {
	   e2.printStackTrace();
	   // TODO: handle exception
	  }
	  catch (BalanceIsLowException e3) {
	   e3.printStackTrace();
	   // TODO: handle exception
	  }
	  catch (MoneyCantWithdrawException e4) {
	   e4.printStackTrace();
	   // TODO: handle exception
	  }
	 }
	
	
}