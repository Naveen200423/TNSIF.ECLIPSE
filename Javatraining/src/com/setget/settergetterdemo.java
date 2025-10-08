package com.setget;
class Student{
	private String name;
	public void setName(String n) {
		name=n ;
	}
	public String getName() {
		return name;
	}
}
public class settergetterdemo {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Naveen");
		System.out.println("Student name:"+s.getName());
		

	}


}
