package com.dsa.questions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,1,4,0,5};
        int target = 4;
       // int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; ++i){
            for (int j = i+1; j < numbers.length; ++j){
                if (numbers[i] + numbers[j] == target){
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }
        return result;
    }
}
