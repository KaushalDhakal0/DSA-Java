package com.kaushal.Generics;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 2;
    private int size = 0;
    public  CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public int[] getData(){
        return this.data;
    }
     public void add(int num){
        if(isFull()){
            resizeArr();
        }
        data[size++] = num;
     }

    private void resizeArr() {
        int temp[] = new int[size * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return this.size  == data.length;
    }

    public int getSize(){
        return size;
    }
}


