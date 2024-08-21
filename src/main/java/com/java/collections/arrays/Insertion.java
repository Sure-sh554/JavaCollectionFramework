package com.java.collections.arrays;

public class Insertion <T>{
    private T[] array;

    public Insertion(T[] array) {
        this.array = array;
    }

    public void insertElement(){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
