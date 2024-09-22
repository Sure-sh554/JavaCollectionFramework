package com.java.collections.stack;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        //Stack uses the principle of Last In First Out
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(10));
    }
}
