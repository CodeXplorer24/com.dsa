package com.dsa.stackqueue1;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>(); // Abstract Class

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println(myStack.pop()); // 5
        System.out.println(myStack.pop()); // 4
        System.out.println(myStack.pop()); // 3
        System.out.println(myStack.pop()); // 2
        System.out.println(myStack.pop()); // 1
       // System.out.println(myStack.pop()); // Empty stack error

        Queue<Integer> myQueue = new LinkedList<>(); //Not a Class

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);

        System.out.println(myQueue.remove()); // removes 1 as FIFO
         
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.add(4);
        myDeque.addLast(55);
    }
}
