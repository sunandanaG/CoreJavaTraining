package com.vm.trainee.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable
{
  BlockingQueue<Integer> Commonqueue;
  
  
  public Producer(BlockingQueue<Integer> commonqueue)
  {
	  super();
	  this.Commonqueue=commonqueue;
	  
  }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("PRODUCER:");
			Commonqueue.add(i);
			System.out.println("print elements"+i);
			System.out.println("queue elements are:"+Commonqueue);
			
		}
	}

}
