package com.dsa.string;
import java.util.Scanner;
public class StringBasics {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        String name = "Jyotish";
        String name1 = "Jyotish";

        // compares if the reference variable(only variable name stored in stack memory)
        // is pointing to the same object in pool of heap memory
        System.out.println(name == name1);

        // for comparison of values or objects of string variable
        // use string1.equals(string2)
        System.out.println(name.equals(name1));

        // can't use name[2] instead string.charAt(index);
        System.out.println(name.charAt(1));

        String a = "Jyotish";
        System.out.println(a);
        a = "Anand";
        System.out.println(a);


    }
}
