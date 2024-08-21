package com.java.collections.arrays;

import java.util.Arrays;

public class Traversing<T> {
    private T[] array;

    public Traversing(T[] array) {
        this.array = array;
    }

    public void traverse() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void traverseWithStream() {
        Arrays.stream(array)
                .forEach(System.out::println);
    }
}


