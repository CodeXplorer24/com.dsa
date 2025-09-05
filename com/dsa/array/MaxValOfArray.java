package com.dsa.array;
import java.util.Scanner;
public class MaxValOfArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = {44,55,1000,88,99,88};
        System.out.println("Maximum value present: "+maxVal(arr));
    }
    public static int maxVal(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; ++i){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}


