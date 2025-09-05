package com.dsa.array;

public class BsearchInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,9,35,55,70,85,90,98};
        int target = 85;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] nums, int target){
        int l = 0;
        int r = 1;
        while(l <= r){
            int m = (l+r)/2;
            if (nums[m] == target){
                return m;
            }
            else {
                l = r + 1;
                r = (r+1)* 2;
            }
        }
        return -1;
    }
}
