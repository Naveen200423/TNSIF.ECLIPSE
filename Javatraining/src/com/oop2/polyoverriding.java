package com.oop2;
class Methodoverride{
	public void show() {
		System.out.println("This is parent class");
	}
}
class Child extends Methodoverride{
	public void show() {
		System.out.println("This is child class");
	}
}
public class polyoverriding {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		

	}
}
