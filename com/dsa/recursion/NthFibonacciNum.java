package com.dsa.recursion;

public class NthFibonacciNum {
    public static void main(String[] args) {
        int num = 6;
         System.out.println(fibonacci(num)); //8
    }
    public static int fibonacci(int n){

        if (n < 2){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
