package com.kaushal.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWithWeight box1 = new BoxWithWeight(10,10,10,99);
        Box box2 = new Box(box1);
        // Main Concept
        // It is not the type of object that determines what members can be accessed(i.e : new BoxWithWeight(10,10,10,99))
        //but the type of reference variable that determines which can be accessed. (i.e Box boxWithWeight));
        // Box boxWithWeight = new BoxWithWeight(10,10,10,99);
        //boxWithWeight.weight will give error because Box does not contain weight because boxWithWeight is
        //initialized using new BoxWithWeight(...) and referencing to Box.
        BoxWithWeight boxWithWeight1 = new BoxWithWeight(box2, 23);
        //here boxWeight1 will be able to access boxWeight1.weight because it is created
        //using new BoxWithWeight() and it is referencing to BoxWithWeight;
        System.out.println("Width = " + boxWithWeight1.width);
        System.out.println("Height = " + boxWithWeight1.height);
        System.out.println("Length = " + boxWithWeight1.length);
        System.out.println("Weight = " + boxWithWeight1.weight);
        //BoxWithWeight boxWithWeightTwo = new Box(box2);
        //how will you call BoxWithWeight Constructor. So,
        //Gives error
    }

}
