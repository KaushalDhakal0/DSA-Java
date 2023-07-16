package com.kaushal.Abstraction;

abstract class Shape {
    private String color;  // Instance variable
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    abstract void draw();  // Abstract method
    public void displayInfo() {
        System.out.println("This is a " + getColor() + " shape.");
    }
}

class Circle extends Shape {
    private double radius;  // Additional instance variable
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + getRadius() + " units.");
    }
}
public class Main {
    public static void main(String[] args) {
        //Shape must be referenced not Circle for abstraction
        Shape shape = new Circle("red", 55);
        shape.draw(); // Output: Drawing a circle.
        System.out.println(shape.getColor());
    }
}
