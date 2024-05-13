package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList  {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(10);
//        list.add(30);
//        list.add(50);
//        list.add(40);
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.reverse(list);
//        System.out.println(list);


        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(1,"suresh",25,30000));
        list.add(new Employee(2,"ramesh",30,90000));
        list.add(new Employee(3,"kane",50,50000));
        list.add(new Employee(4,"warner",29,60000));

        Collections.sort(list,new MySort());//ascending order
        System.out.println(list);

    }
}


