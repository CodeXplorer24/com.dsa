package com.dsa.string;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome: ");
        String str = ip.next();
        if(isPalindrome(str)){
            System.out.println(str + " is a Palindrome.");
        }
        else {
            System.out.println(str + " isn't a Palindrome.");
        }
    }
    public static boolean isPalindrome(String str){

        if (str.isEmpty()){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; ++i){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);

            if (start != end){
                return false;
            }
        }
        return true;
    }
}
