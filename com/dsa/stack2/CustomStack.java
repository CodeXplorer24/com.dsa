package com.dsa.stack2;

import java.util.Arrays;

public class CustomStack {

    protected int[] stackArr;
    private static final int DEFAULT_SIZE = 5;
    protected int top;

    public CustomStack () {
        this.stackArr = new int[DEFAULT_SIZE];
        this.top = -1;
    }

    public CustomStack (int size){
        this.stackArr = new int[size];
        this.top = -1;
    }

    public void push (int val)  {
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        stackArr[++top] = val;
    }

    public int pop ()  {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return stackArr[top--];
    }

    public void peek () {
        if ( isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }
        System.out.print(stackArr[top]);
    }
    
    public void display () {
        if (isEmpty()){
            System.out.println("Empty Stack");
        }
        System.out.println(Arrays.toString(stackArr));

    }

    public boolean isEmpty () {
        return top == -1;
    }

    public boolean isFull () {
        return top == DEFAULT_SIZE - 1;
    }
}
