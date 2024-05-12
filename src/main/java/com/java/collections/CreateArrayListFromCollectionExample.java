package com.java.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        //create arrayList object

//        List<Integer> firstFivePrimeNumbers=new ArrayList<>();
//        firstFivePrimeNumbers.add(2);
//        firstFivePrimeNumbers.add(3);
//        firstFivePrimeNumbers.add(5);
//        firstFivePrimeNumbers.add(7);
//        firstFivePrimeNumbers.add(11);
//
////        public ArrayList(Collection<? extends E> c) {
////            Object[] a = c.toArray();
////            if ((size = a.length) != 0) {
////                if (c.getClass() == ArrayList.class) {
////                    elementData = a;
////                } else {
////                    elementData = Arrays.copyOf(a, size, Object[].class);
////                }
////            } else {
////                // replace with empty array.
////                elementData = EMPTY_ELEMENTDATA;
////            }
//
//        List<Integer> nextTenPrimeNumbers=new ArrayList<>(firstFivePrimeNumbers);
//        nextTenPrimeNumbers.add(13);
//        nextTenPrimeNumbers.add(17);
//        nextTenPrimeNumbers.add(19);
//        nextTenPrimeNumbers.add(23);
//        nextTenPrimeNumbers.add(29);
//        firstFivePrimeNumbers.addAll(nextTenPrimeNumbers);
//
//        System.out.println(nextTenPrimeNumbers);



        List<String> courses= Arrays.asList("c","c++","java","spring","hibernate");
//
//        //basic for loop
//        for (int i=0;i< courses.size();i++){
//            System.out.println(courses.get(i));
//        }
//        //Enhanced for loop
//
//        for (String course:courses) {
//            System.out.println(course);
//
//        }
//        //basic loop with iterator
//
//        for (Iterator iterator=courses.iterator();
//             iterator.hasNext();)
//        {
//            String course= (String) iterator.next();
//            System.out.println(course);
//
//        }
        Iterator iterator=courses.iterator();
                while (iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }
        System.out.println(iterator);

    }


}
