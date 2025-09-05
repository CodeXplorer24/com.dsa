package com.dsa.array;
import java.util.Arrays;
import java.util.Scanner;
public class StringArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // array of objects
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++){
            str[i] = ip.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
