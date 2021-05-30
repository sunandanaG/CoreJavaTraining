package com.vm.trainee.java.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer 
{
  public static void main(String[] args) {
	
	  BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
	  
	  Producer producer=new Producer(bq);
	  Consumer consumer=new Consumer(bq);
	  
	  Thread t1=new Thread(producer);
	  Thread t2=new Thread(consumer);
	  t1.start();
	  t2.start();
	  
}
}
