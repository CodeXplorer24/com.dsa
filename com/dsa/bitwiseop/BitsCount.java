package com.dsa.bitwiseop;

public class BitsCount {
    public static void main(String[] args) {
        // Number of bits = total number of 1s in the binary number
        int num = 49;
        System.out.printf("No of bits in %s = %d",Integer.toBinaryString(num),bitsCount(num));
    }
    static int bitsCount(int num){
        int totalBits = 0;
        while (num != 0){
            if ((num & 1) == 1){ //
                totalBits++;
            }
            num = num >> 1; //Shifts right by 1 or divide the num by 2
        }
        return totalBits;
    }
}
