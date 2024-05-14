package com.java.collections.map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new java.util.HashMap<>();
        //add key value pair

        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four", 4);
        numberMapping.put("Five", 5);
        numberMapping.put("Six", 5);
        numberMapping.put("Six", 6);
        numberMapping.put(null, 2);
        numberMapping.put(null, 3);
        System.out.println(numberMapping);

        // Check Hash Map is empty or not

        boolean empty = numberMapping.isEmpty();
        System.out.println(empty);

        //To find the size of the HashMap

        System.out.println(numberMapping.size());
        //Check if a key exists in the HashMap

        if (numberMapping.containsKey("Three")) {
            System.out.println("Exist");
        } else
            System.out.println("Not Exist");

        // check if a value exists in HashMap
        if (numberMapping.containsValue(4))
        {
            System.out.println("Exist");
        }
        else {
            System.out.println("Not Exist");
        }
        //get value by key

        Integer v1=numberMapping.get("Six");
        System.out.println(v1);

        //to remove key form the HashMap

        numberMapping.remove("One");
        System.out.println(numberMapping);

    }
}
