package com.StreamApi;

public class Product {
	
	    int id;
	    String name;
	    float price;

	    // Constructor
	    public Product(int id, String name, float price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    // Optional: getter methods (if you want to follow best practices)
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public float getPrice() {
	        return price;
	    }

	    // Optional: toString() for easy printing
	    @Override
	    public String toString() {
	        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	    }
	}


