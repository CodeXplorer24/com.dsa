package com.dsa.array;
import java.util.ArrayList;

public class OccurenceOfNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,2,9,8,3};
        ArrayList<Integer> ans = printOccurences(arr);
        for (int a : ans){
            System.out.print(a + " ");
        }
    }

    static ArrayList<Integer> printOccurences(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for ( int i = 0; i < n; i++){
            int count = 0;
            for ( int j = 0; j < n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
}
