package com.dsa.array;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; ++i){
            for (int j = 0; j < arr[i].length; ++j){
                arr[i][j] = ip.nextInt();
            }
        }
        for(int[] num : arr){ // int[] becoz different array is stored in 2d arrays
            System.out.println(Arrays.toString(num));
        }
    }
}
