package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RetrivingTheLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruit=new LinkedList<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add(null);

        String fruits=fruit.getFirst();
        fruit.getLast();
        fruit.get(2);


    }

}
