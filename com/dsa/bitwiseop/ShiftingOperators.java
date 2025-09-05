package com.dsa.bitwiseop;

public class ShiftingOperators {
    public static void main(String[] args){
        int dNum = 20;

        //Left shift operators multiplies the num by 2^n where n is total no of shifting
        System.out.println(dNum << 1);
        System.out.println(dNum << 2);

        // Right shift operators divides the num by 2^n where n is total no of shifting
        System.out.println(dNum >> 1);
        System.out.println(dNum >> 2);

        long bNum1 = 1000101; // Java treats as decimal not binary
        long bNum = 100;

        System.out.println("Binary of " + bNum + " = " + Long.toBinaryString(bNum));
        System.out.println("Left shift = " + Long.toBinaryString(bNum << 1));
        System.out.println("Right shift = " + Long.toBinaryString(bNum >> 1));
    }
}
