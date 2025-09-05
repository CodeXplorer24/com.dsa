package com.dsa.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        printNum(5);
    }

    private static void printNum(int count) {
        if (count <= 0){
            return;
        }
        // Backtrack recursion
        printNum(count-1);
        System.out.println(count);
    }
}
