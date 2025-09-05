package com.dsa.hashing;

import java.util.Scanner;
public class CountFrequencyOfNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = {5,1,1,3,7,8,8,9};
        int[] hashArray = new int[10];

        for (int i = 0; i < arr.length; ++i){
            hashArray[arr[i]] = hashArray[arr[i]] + 1; // Storing the frequency of arr in hashArray
        }

        System.out.println("Enter Queries: ");
        int q = ip.nextInt();
        while (q-- != 0){
            int num = ip.nextInt();
            System.out.print(hashArray[num] + " ");
        }

    }

}
