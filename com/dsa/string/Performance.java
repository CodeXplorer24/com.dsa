package com.dsa.string;

public class Performance{
    public static void main(String[] args) {
        String alphabet = "";
        for (int i = 0; i < 26; ++i){
            char atoz = (char)('a'+i);
            //System.out.println(atoz);
            alphabet = alphabet + atoz;
        }
        System.out.println(alphabet);
    }
}

