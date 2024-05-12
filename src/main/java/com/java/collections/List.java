package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        java.util.List<String> list=new ArrayList<>();

//        //List allows you to add duplicate elements
//        list.add("element1");
//        list.add("element1");
//        System.out.println(list);
//        //List allows you to have null elements
//
//        list.add(null);
//        list.add(null);
//        System.out.println(list);

        // ordered collection allows the duplicate and insertion order

        list.add("element1");
        list.add("element2");
        list.add("element4");
        list.add("element3");
        list.add("element5");
        System.out.println(list);

        //Access elements from list

        System.out.println(list.get(0));
        list.set(2,"aaa");
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.indexOf("element1"));

       // System.out.println(list.subList(2,3));

        System.out.println( list.getClass());


        ArrayList<String> arrayList=new ArrayList<>();



    }
}
