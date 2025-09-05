package com.dsa.recursion;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
    int[] array = {1,4,6,9,24,38,44,60,77,88,99};
    int target = 60;
    System.out.println(bSearch(array, target, 0, array.length-1));
    }
    public static int bSearch(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        else if (target > arr[mid]){
            return bSearch(arr, target, mid+1, e);
        }
        else {
            return bSearch(arr, target, s, mid - 1);
        }
    }
}
