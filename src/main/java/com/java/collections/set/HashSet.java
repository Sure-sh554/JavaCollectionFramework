package com.java.collections.set;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer>  integers=new java.util.HashSet<>();
        integers.add(5);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        integers.add(null);
        integers.add(null);
        System.out.println(integers);
    }
}
