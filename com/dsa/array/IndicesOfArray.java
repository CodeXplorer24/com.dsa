package com.dsa.array;
import java.util.ArrayList;
import java.util.Scanner;
public class IndicesOfArray {
    public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 5; ++i){
            array.add(ip.nextInt());
        }

        ArrayList<Integer> arr2 = indices(array);

        for (int i = 0; i < arr2.size(); ++i){
            System.out.print(arr2.get(i)+ " ");
        }
//        inputArray(array);
//        ArrayList<Integer> arr2 = indices(array);
//        System.out.println(arr2);


    }


    public static ArrayList<Integer> indices (ArrayList<Integer> arr ){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); ++i){
            int max = arr.get(0);
            if (max <= arr.get(i)){
                ans.add(i);
                max = arr.get(i);
            }
        }
        return ans;
    }

    public static void printArray(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); ++i){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void inputArray(ArrayList<Integer> arr){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = ip.nextInt();
        for (int i = 0; i < n; ++i){
            arr.add(ip.nextInt());
        }
    }

}
