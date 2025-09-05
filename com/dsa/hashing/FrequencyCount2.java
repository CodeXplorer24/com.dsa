package com.dsa.hashing;

import java.util.HashMap;
public class FrequencyCount2 {
    public static void main(String[] args) {
        int[] arr = {10,25,5,5,10,4,25,30,25,1};
        
        countFrequency(arr);
    }
    static void countFrequency (int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; ++i){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])  + 1); // map.get() retrieve frequency stored at arr[i] and increase by 1
            }
            else {
                map.put(arr[i], 1); // stores the frequency
            }
        }
        System.out.println("Num : Frequencies");
        for (Integer k : map.keySet()){
            System.out.println(k + ":" + map.get(k));
        }
    }
}
