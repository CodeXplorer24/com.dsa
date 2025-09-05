package com.dsa.bitwiseop;

public class UniqueElement {
    public static void main(String[] args) {

        //- Duplicates cancel out (a ^ a = 0)
        //- XOR with 0 gives the number itself (0 ^ a = a)

        int[] arr = {1,3,2,5,3,6,5,1,2};
        System.out.println(findUniqueNum(arr));
    }
    static int findUniqueNum(int[] arr){
        int uniqueNum = 0;
        for (int i = 0; i < arr.length; ++i){
           uniqueNum = uniqueNum^arr[i];
        }
        return uniqueNum;
    }
}
