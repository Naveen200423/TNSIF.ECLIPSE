package com.oop2;
class Methodover{
	public void demo() {
		System.out.println("This is a method with default parameters");
		}
	public void demo(int a) {
		System.out.println("This is a method with one parameters");
		}
	public void demo(int a,float b) {
		System.out.println("This is a method with two parameters");
		}
}
public class polyoverloading {
	public static void main(String[] args) {
		Methodover mo=new Methodover();
		mo.demo();
		mo.demo(20);
		mo.demo(10,30);

	}
}
