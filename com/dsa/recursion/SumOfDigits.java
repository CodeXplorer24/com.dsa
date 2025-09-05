package com.dsa.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(55555));
    }

    static int digitSum (int n){
        if (n == 0){
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
}

/*
digitSum(55555) → 5 + digitSum(5555)
digitSum(5555)  → 5 + digitSum(555)
digitSum(555)   → 5 + digitSum(55)
digitSum(55)    → 5 + digitSum(5)
digitSum(5)     → 5 + digitSum(0)
digitSum(0)     → 0
*/
