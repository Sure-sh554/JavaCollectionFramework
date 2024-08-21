package com.java.collections.linkedlist;

import java.util.LinkedList;

public class SingleLinkedListUsingJCF {
    public void singleLinkedListUsingJCF(){
        LinkedList<String> fruits=new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);
        fruits.addFirst("Pear");
        System.out.println(fruits);
        fruits.addLast("Strawberry");
        System.out.println(fruits);
        fruits.add(3,"plum");
        System.out.println(fruits);
        fruits.removeFirst();
        System.out.println(fruits);
        fruits.removeLast();
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
        fruits.clear();
       System.out.println(fruits);
      System.out.println(fruits.isEmpty());
//        System.out.println(fruits.size());
//        System.out.println(fruits.contains("Mango"));
//        System.out.println(fruits.get(0));
//        System.out.println(fruits.set(0,"Orange"));
//        System.out.println(fruits);
//        System.out.println(fruits.indexOf("Orange"));
//        System.out.println(fruits.lastIndexOf("Orange"));
//        System.out.println(fruits.subList(0, 2));
//        System.out.println(fruits.toArray());
//        System.out.println(fruits.toString());
//        System.out.println(fruits.hashCode());
//        System.out.println(fruits.equals(fruits));
//        System.out.println(fruits.clone());
//        System.out.println(fruits.descendingIterator());
//        System.out.println(fruits.listIterator());
//        System.out.println(fruits.listIterator(1));

    }


}
