package com.java.collections.set;

import java.util.Map;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> integers = new java.util.TreeSet<>();
        integers.add(10);
        integers.add(5);
        integers.add(1);
        integers.add(2);
        integers.add(3);

        integers.add(11);
       // integers.add(null);
        for (Integer integer : integers) {
            System.out.println(integers);
        }

    }
}
