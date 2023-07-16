package com.kaushal.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape rectangle  = new Rectangle(12,12);
        Shape circle = new Circle(87);
        Shape square = new Square(10);
//        Rectangle rectangle  = new Rectangle(12,12);
//        Circle circle = new Circle(87);
//        Square square = new Square(10);
        rectangle.calculateArea();
        circle.calculateArea();
        square.calculateArea();
        Shape.greet();
    }
}
