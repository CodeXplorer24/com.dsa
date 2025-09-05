package com.dsa.string;

public class SB {
    public static void main(String[] args) {
        StringBuilder alphabet = new StringBuilder();
        for (int i = 0; i < 26; ++i){
            char atoz = (char)('a'+i);
            alphabet.append(atoz);

        }
        System.out.println(alphabet);
        System.out.println(alphabet.reverse());
    }
}
