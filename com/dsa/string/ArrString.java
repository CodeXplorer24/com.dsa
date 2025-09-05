package com.dsa.string;

import java.util.Arrays;
import java.util.Scanner;
public class ArrString {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.println("Enter Strings: ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = ip.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}
