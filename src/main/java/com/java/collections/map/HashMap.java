package com.java.collections.map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
       Map<Integer,String> map=new java.util.HashMap<>();
       map.put(5,"Spring");
       map.put(1,"Java");
       map.put(2, "Python");
       map.put(3, "C++");
       map.put(4, "C#");
        map.put(16, "JavaScript");  // Adding this
        map.put(32, "Ruby");
        System.out.println(map);

    }
}
