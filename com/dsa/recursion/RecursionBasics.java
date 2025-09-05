package com.dsa.recursion;

public class RecursionBasics {
    public static void main(String[] args) {
       //sayHi(10);
        printNum(5);

    }

    private static void sayHi(int count) {
        System.out.println("Hi!");
        if (count <= 1){
            return;
        }
        sayHi(count-1);
    }

    private static void printNum(int count){
        System.out.println(count);
        if (count <= 1){
            return;
        }
        printNum(count-1);

    }
}