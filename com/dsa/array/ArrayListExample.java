package com.dsa.array;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<> ();
        list1.add(444);
        list1.add(55);
        list1.add(8889);
        list1.add(00);
        list1.add(5,555);
        System.out.println(list1);
        System.out.println(list1.contains(55));
        list1.set(0,99); // For updating the element
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);

        // Another way of input and output
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; ++i){
            list2.add(ip.nextInt());
        }
        for (int i = 0; i < 5; ++i){
            System.out.print(list2.get(i) +" ");
        }
    }
}
