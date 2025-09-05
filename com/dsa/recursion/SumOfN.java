package com.dsa.recursion;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sumOfNum(5));
    }
    static int sumOfNum (int n) {

        if (n <= 1){
            return 1;
        }
        return n + sumOfNum(n-1);
    }
}
