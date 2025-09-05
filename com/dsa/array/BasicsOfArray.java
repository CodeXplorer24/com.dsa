package com.dsa.array;
import java.util.Arrays;
import java.util.Scanner;
public class BasicsOfArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // Arrays of Primitives data type

        // data_type[] variable_name = new data_type[size];
        // data_type[] variable_name = {data};
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; ++i){
            arr[i] = ip.nextInt();
        }
        for (int i = 0; i < arr.length; ++i){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int[] arr2 = {55, 66, 88, 99, 1000};

        // Accessing elements directly
        for (int num : arr2) {
            System.out.print(num+ " ");
        }


        System.out.println();
        int[] arr3 = {88, 545, 98, 00, 54};
        System.out.println(Arrays.toString(arr3));



    }
}
