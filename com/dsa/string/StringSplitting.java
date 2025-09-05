package com.dsa.string;

import java.util.Arrays;

public class StringSplitting {
    public static void main(String[] args) {
        String text = "One two three fourth";
        String[] splittedText = text.split(" ");
        System.out.println(text);
        System.out.println(Arrays.toString(splittedText));

        for (String words : splittedText){
            System.out.println(words);
        }

    }
}
