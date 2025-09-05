package com.dsa.circularlinkedlist;

public class Main {
    public static void main(String[] args) {
        CCL cList = new CCL();
        cList.insertFirst(1);
        cList.insertFirst(2);
        cList.insertFirst(3);

        cList.display();

        cList.deleteFirst();
        cList.display();

        cList.deleteLast();
        cList.display();
    }
}
