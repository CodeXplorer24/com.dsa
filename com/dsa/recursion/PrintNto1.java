package com.dsa.recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        printRevNum(10);
    }

    private static void printRevNum(int num) {
        System.out.println(num);
        if (num <= 1){
            return;
        }
        printRevNum(num-1);
    }
}
