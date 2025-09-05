package com.dsa.recursion;

public class PrintingNum {
    public static void main(String[] args) {
        System.out.println(printNum(5));
    }
    static int printNum (int num){
        if (num <= 0) {
            return 1;
        }
        return printNum(num-1);
    }
}
