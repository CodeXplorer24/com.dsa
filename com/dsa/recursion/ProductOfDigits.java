package com.dsa.recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(digitsProduct(12345));
    }

    static int digitsProduct (int n){
        if ( n%10 == n){
            return n;
        }
        return (n%10)*digitsProduct(n/10);
    }
}
