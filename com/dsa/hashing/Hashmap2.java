package com.dsa.hashing;

import java.util.HashMap;

public class Hashmap2 {
    public static void main(String[] args) {

        // Hashmap is a data type for storing key value pair
        // Key is unique but values can be duplicate
        // Doesn't maintain any order but memory efficient
        // HashMap<Key,Value> variable_name = new HashMap<>();

        HashMap<String,Double> map = new HashMap<>();
        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 2.0);
        map.put("Coconut", 5.0);

        System.out.println(map); // Prints key value pair
        System.out.println(map.get("Orange")); // Using get method we can fetch value of that key

        map.remove("Coconut");
        System.out.println(map);

        System.out.println(map.isEmpty()); //False
        System.out.println(map.containsValue(0.50)); //True
        System.out.println(map.containsKey("Coconut")); // False
        System.out.println(map.size()); // 3 key-value pairs
        System.out.println(map.hashCode()); // Prints the hashcode
        System.out.println(map.toString());

        // Another way of printing key value pairs

        for (String k : map.keySet()){
            System.out.println(k + ":" + map.get(k));
        }

    }
}
