package com.dsa.linkedlist2;

public class Main {
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.display();
        list.reverseList();
        list.display();
    }
}
