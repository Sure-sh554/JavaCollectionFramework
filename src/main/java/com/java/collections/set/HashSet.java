package com.java.collections.set;

import com.java.collections.arrays.Insertion;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> integers=new java.util.HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        integers.add(4);
        integers.add(null);
        integers.add(null);
        System.out.println(integers);
       Object [] arr= integers.toArray();
       for(Object obj:arr){
            System.out.println(obj);
        }
    }
}
