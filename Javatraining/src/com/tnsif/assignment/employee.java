package com.tnsif.assignment;

public class employee {
	
	public class Employees {
	    protected String name;
	    protected int id;
	    protected double salary;

	    public Employees(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    public void showEmployeeInfo() {
	        System.out.println("Employee Name: " + name +
	                           ", ID: " + id +
	                           ", Salary: " + salary);
	    }

	    @Override
	    public String toString() {
	        return name + " (ID: " + id + ", Salary: " + salary + ")";
	    }
	}

}
