package com.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL myList = new LL();
        myList.insertFirst(22);
        myList.insertFirst(15);
        myList.insertFirst(55);
        myList.insertFirst(65);
        myList.insertFirst(87);
        myList.insertLast(99);
        myList.insertLast(88);
        myList.insertAt(2,77);
        myList.deleteFirst();

        myList.printElements();
    }
}
