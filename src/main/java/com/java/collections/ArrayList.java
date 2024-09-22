package com.java.collections;

import java.util.Collections;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        //Created Array List Object

//        List<String> fruits=new java.util.ArrayList<>();
//        fruits.add("banana");
//        fruits.add("apple");
//        fruits.add("mango");
//        fruits.add("orange");
//        System.out.println(fruits);

        List<Integer> numbers=new java.util.ArrayList<>();
        Collections.addAll(numbers,1,2,3,4,5);
        numbers.add(1);
        numbers.add(-2);
        numbers.add(-3);
        numbers.add(4);
        numbers.add(0);
        boolean hasNegativeNumber=numbers.stream().anyMatch(x->x<0);
      //  boolean hasNegative = containsNegative(numbers);


    }
}
