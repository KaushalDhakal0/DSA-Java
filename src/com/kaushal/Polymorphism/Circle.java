package com.kaushal.Polymorphism;

public class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void calculateArea(){
        System.out.println("Area of Circle = " + (3.14 * this.radius * this.radius));
    }
}
