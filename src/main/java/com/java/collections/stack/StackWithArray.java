package com.java.collections.stack;

public class StackWithArray {
    private int[] arr;
    private int top;
    private int capacity;

    StackWithArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push() {
        if (isFull()) {
            System.out.println("Stack is full");

        }
        arr[++top] = 0;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    private boolean isFull() {
        return top == capacity;
    }

    private boolean isEmpty() {
        return top == -1;
    }

}
