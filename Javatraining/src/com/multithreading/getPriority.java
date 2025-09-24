package com.multithreading;


	public class getPriority extends Thread {

		public static void main(String[] args) {
			System.out.println("The running thread is :" +Thread.currentThread().getName());
			System.out.println("The running thread priority is :" +Thread.currentThread().getPriority());
		}			

}
