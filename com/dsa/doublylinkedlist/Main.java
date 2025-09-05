package com.dsa.doublylinkedlist;

public class Main {
    public static void main (String[] args) {
        DLL doublyList = new DLL();
        doublyList.insertFirst(5);
        doublyList.insertFirst(4);
        doublyList.insertFirst(3);
        doublyList.insertFirst(2);
        doublyList.insertFirst(1);
        doublyList.displayForward();
        doublyList.displayReverse();
        doublyList.insertLast(6);
        doublyList.displayForward();
        doublyList.insertAt(0,0);
        doublyList.insertAt(8,12);
        doublyList.displayForward();
        System.out.println(doublyList.countNodes());
    }
}
