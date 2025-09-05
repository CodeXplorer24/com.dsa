package com.dsa.recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        printRevNum(10);
    }

    private static void printRevNum(int num) {

        if (num <= 0){
            return;
        }
        System.out.println(num);
        printRevNum(num-1);
    }
}
