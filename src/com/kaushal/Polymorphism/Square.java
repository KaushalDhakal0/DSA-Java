package com.kaushal.Polymorphism;

public class Square extends Shape {
    double length;
    Square(double length){
        this.length = length;
    }
    @Override
    void calculateArea(){
        System.out.println("Area of Square : " + (this.length * this.length));
    }
}
