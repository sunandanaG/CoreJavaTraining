package com.vm.trainee.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable 
{
	BlockingQueue<Integer> commonQueue;


	public Consumer(BlockingQueue<Integer> commonQueue)
	{
		super();
		commonQueue=commonQueue;

	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
	  	{
           try
           {
        	   System.out.println("common queue:"+commonQueue.take());
           }
           catch(InterruptedException e)
           {
        	   e.printStackTrace();
           }
		}
	}

}
