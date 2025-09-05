package com.dsa.hashing;
import java.util.HashMap;

public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> empids = new HashMap<>();
        empids.put("Jyotish", 12345);
        empids.put("Darshit", 86098);
        empids.put("Anshu", 786545);
        System.out.println(empids);

        System.out.println(empids.get("Anshu"));
        System.out.println(empids.containsKey("Darshit"));
        System.out.println(empids.containsValue(12345));

        empids.remove("Darshit");
        System.out.println(empids);
        
    }
}
