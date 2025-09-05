package com.dsa.bitwiseop;

public class FastPower {
    public static void main(String[] args) {
        // Time Complexity = log power form (power)
        int base = 3;
        int power = 5;
        System.out.printf("%d^%d = %d",base,power,findExponent(base,power));
    }
    static int findExponent(int base, int power){
        int result = 1;
        while (power != 0){
            if ((power&1) == 1){
                result = result*base;
            }
            base = base*base;
            power = power >> 1;
        }
        return result;
    }
}
