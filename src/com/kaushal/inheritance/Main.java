package com.kaushal.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(box1);
        //System.out.println("BOX ONE == height: " + box1.height + " width " + box1.width + " length " + box1.length);
        //System.out.println("BOX ONE == height: " + box2.height + " width " + box2.width + " length " + box2.length);

        Box boxWithWeight = new BoxWithWeight(10,10,10,99);

        BoxWithWeight boxWithWeight1 = new BoxWithWeight(box2, 23);
        System.out.println("Width = " + boxWithWeight1.width);
        System.out.println("Height = " + boxWithWeight1.height);
        System.out.println("Length = " + boxWithWeight1.length);
        System.out.println("Weight = " + boxWithWeight1.weight);
    }
}
