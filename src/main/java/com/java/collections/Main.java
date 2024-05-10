package com.java.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Collection<String> fruitCollection =new ArrayList<>();
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("mango");
        fruitCollection.add("pear");
        System.out.println(fruitCollection);
        String[] fruit=fruitCollection.toArray(new String[0]);
        System.out.println(Arrays.toString(fruit));

        System.out.println(fruitCollection.size());

        Boolean match=fruitCollection.stream().anyMatch(s->s.contains("aa"));
        System.out.println(match);


        System.out.println(fruitCollection.stream().count());

        System.out.println(fruitCollection.stream().allMatch(s -> s.startsWith("b")));
        System.out.println(fruitCollection.stream().count());
        System.out.println(fruitCollection.stream().distinct());




        }
    }
