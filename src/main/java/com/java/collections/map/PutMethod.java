package com.java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class PutMethod {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("A","AAA");
        System.out.println(map.put("B","BBB"));
        map.put("C", "CCC");
        map.put("D", "DDD");
        map.put("E", "EEE");
        map.put("F", "FFF");
        System.out.println(map.put("C","ttt"));
        System.out.println(map);
        map.compute("A",(k,v)->v.toLowerCase());
        System.out.println(map);



//        Map<String,String> numberMapping=new HashMap<>();
//        numberMapping.putAll(map);
//        System.out.println(numberMapping);
//        System.out.println(numberMapping.get("A"));
//        System.out.println(numberMapping.get("s"));
//        numberMapping.remove("A");
//        System.out.println(numberMapping);
//        System.out.println(numberMapping.remove("A"));

    }
}
