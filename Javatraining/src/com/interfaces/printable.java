package com.interfaces;

// All interfaces
interface Printable {
    void print();
}

interface Showable {
    void show();
}

interface Drawable {
    void draw();
}

interface Playable {
    void play();
}

// Demo class implementing all interfaces
class Demo implements Printable, Showable, Drawable, Playable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

    public void draw() {
        System.out.println("Drawing...");
    }

    public void play() {
        System.out.println("Playing...");
    }
}

// Test class with main method
public class InterfaceDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
        obj.draw();
        obj.play();
    }
}
