package com.dsa.bitwiseop;

public class BitOperations {
    public static void main(String[] args) {
        // num >> k: Right-shifts the number k times, bringing the k-th bit to the least significant position.
        // & 1: Isolates the least significant bit to check if it’s 0 or 1
        int num = 49;
        int k = 4;
        System.out.println(Integer.toBinaryString(num));
        System.out.printf("%dth bit of %d = %d\n", k, num , findSpecificBit(num,k));
        System.out.printf("Set %dth bit to 1 = %d\n",k, setSpecificBit(num,k)); // As 4th bit is already 1 that's why num remain unchanged
        System.out.println(resetSpecificBit(num,k));
    }

    static int findSpecificBit(int num, int k){
        return (num >> k) & 1;
    }
    static int setSpecificBit(int num, int k){
       // return (num >> k) | 1; wrong way
        return num | (1 << k);
    }
    static int resetSpecificBit(int num, int k){
        return num & ~(1 << k);
    }
}
