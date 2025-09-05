package com.dsa.string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+5);
        System.out.println((char)('a'+5)); //casting
        System.out.println("a"+1);
        //Here 1 is converted into Integer wrapper class and then by toString
        // it is converted into string "1"
        System.out.println("You" + new Integer(99));
        System.out.println("You" + new ArrayList<>());
        String s = new ArrayList<>() + "" + new Integer(55);
        // for concatenation one of the data type should be string
        System.out.println(s);
    }
}
