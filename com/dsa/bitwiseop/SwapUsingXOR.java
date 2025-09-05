package com.dsa.bitwiseop;

public class SwapUsingXOR {
    public static void main(String[] args) {
        int a = 104;
        int b = 560;
        System.out.printf("Before Swapping\n a = %d, b = %d \n", a,b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.printf("After Swapping\n a = %d, b = %d ", a,b);
    }
}
