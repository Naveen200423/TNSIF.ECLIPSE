package com.multithreading;

public class Runnableinterface implements Runnable {

	
		public void run() {
			for(int i=1;i<=10;i++)
			{
				try {
					System.out.println(i);
					Thread.sleep(2000);
				}catch(Exception e)
				{
					System.out.println("e");
				}
			}
		}

		public static void main(String[] args) {
			Runnableinterface rn = new Runnableinterface();
	        Thread t1 = new Thread(rn);
	        t1.start();
		}
	}

	

