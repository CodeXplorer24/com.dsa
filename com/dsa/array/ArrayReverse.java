package com.dsa.array;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
        // System.out.println(Arrays.toString(reverseArray2(arr))); won't work as there is no return type
        reverseArray2(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Not direct changes in the array
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[n-i-1] = arr[i];
        }
        return result;
    }

    //Inplace reversal direct changes in the array without creating a new array
    // two pointers approach
    static void reverseArray2(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        while (l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

    }
    
}
