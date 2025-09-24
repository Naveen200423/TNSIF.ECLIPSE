package com.multithreading;


	public class ThreadExtends extends Thread{ //Multithread Extends Thread
		public void run() {
			for(int i=0; i<=10; i++)
			{
				try {
					System.out.println("Hello");
					Thread.sleep(2000);
				}catch(Exception e)
				{
					System.out.println("e");
				}
			}
		}

		public static void main(String[] args) {
			ThreadExtends te = new ThreadExtends();
			te.start();

		}
		}


