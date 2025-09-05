package com.dsa.bitwiseop;
import static java.lang.Math.pow;

public class FindMagicNum {
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("%dth Magic Number = %d",n,magicNum(n));
    }
    static int magicNum(int n){
        int result = 0;
        int i = 1;
        while ( n != 0){
            int lastDigit = n & 1;
            result += (int) (lastDigit*pow(5,i));
            n = n >> 1;
            i++;
        }
        return result;
    }
}
