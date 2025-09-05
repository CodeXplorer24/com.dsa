package com.dsa.bitwiseop;

public class BitsLength {
    public static void main(String[] args) {
        int num = 49;
        int temp = num;
        int count = 0;
        while (num != 0){
            num = num >> 1;
            count++;
        }
        System.out.printf("Length of the num %s = %d",Integer.toBinaryString(temp) ,count);
    }
}
