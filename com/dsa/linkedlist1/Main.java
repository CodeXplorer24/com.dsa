package com.dsa.linkedlist1;

public class Main {
    public static void main(String[] args) {
        List myList = new List();
        myList.insertFirst(5);
        myList.insertFirst(10);
        myList.insertLast(6);
        myList.insertLast(7);
        myList.display();
       // myList.insertAt(55,3);
        //myList.deleteFirst();
        //myList.deleteLast();
        //myList.deleteAt(4);
        System.out.println();
        myList.display();
        System.out.println(myList.searchVal(8));
     //   System.out.println(myList.size);
        System.out.println(myList.countNodes());
        System.out.println(myList.findMid());
        System.out.println(myList.findMid_2());
    }
}
