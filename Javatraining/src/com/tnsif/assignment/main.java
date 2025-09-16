package com.tnsif.assignment;


package com.tnsif.rishi.assignment.employees;

	public class Developers extends Employee {
	    private String programmingLanguage;  // better as private

	    public Developers(String name, int id, double salary, String language) {
	        super(name, id, salary, "Developer");
	        this.programmingLanguage = language;
	    }

	    public void showDeveloperDetails() {
	        System.out.println("Developer ID: " + employeeId +
	                           ", Salary: " + salary +
	                           ", Language: " + programmingLanguage);
	    }
	}


}
