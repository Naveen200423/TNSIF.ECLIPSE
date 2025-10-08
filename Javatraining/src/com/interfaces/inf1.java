package com.interfaces;

public interface inf1 {
	void call();
	void sms();
}
class jio implements inf1{
	public void call() {
		System.out.println("Calling from Jio..");
	}
	public void sms() {
		System.out.println("Message sent from jio...");
	}
}
class Samsung implements inf1{
	public void call() {
		System.out.println("Calling from Samsung..");
	}
	public void sms() {
		System.out.println("Message sent from Samsung...");
	}
}


