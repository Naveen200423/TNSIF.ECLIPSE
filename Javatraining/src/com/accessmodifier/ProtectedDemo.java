package com.accessmodifier;

class Parent {
    protected void display() {
        System.out.println("Protected Method");
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Parent obj = new Parent(); // Use Parent type
        obj.display(); // ✅ Works in same package
    }
}
