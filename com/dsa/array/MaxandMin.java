package com.dsa.array;

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr = {15,60,5,99,20,-30};
        System.out.println("Minimum Value = " + minValue(arr));
        System.out.println("Maximum Value = " + maxValue(arr));
    }

    static int minValue( int[] arr){
        int n = arr.length;
        int minV = 0;
        for (int i = 0; i < n; i++) {
            if (arr[minV] > arr[i]) {
                minV = i;
            }
        }
        return arr[minV];
    }

    static int maxValue( int[] arr){
        int n = arr.length;
        int maxV = 0;
        for ( int i = 0; i < n; i++){
            if ( arr[maxV] < arr[i]){
                maxV = i;
            }
        }
        return arr[maxV];
    }
}
