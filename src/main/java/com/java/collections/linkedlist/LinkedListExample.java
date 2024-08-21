package com.java.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        java.util.LinkedList<String> fruits=new java.util.LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);

        fruits.add(2,"strawberry");
        System.out.println(fruits);

        fruits.addFirst("pear");
        System.out.println(fruits);

        fruits.addLast("pineapple");
        System.out.println(fruits);

        LinkedList a=new LinkedList();
        a.addAll(fruits);
        System.out.println(a);


    }
}
