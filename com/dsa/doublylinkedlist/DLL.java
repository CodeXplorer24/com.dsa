package com.dsa.doublylinkedlist;

public class DLL {
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node (int val) {
            this.val = val;
        }

        public Node (int val, Node next, Node prev) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;


    public DLL () {
        this.head = null;
    }

    void insertFirst (int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    void insertLast (int val) {
        if ( head == null) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node currentNode = head;
        while ( currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
        newNode.next = null;
    }

    void insertAt (int pos, int val) {
        if ( pos == 0) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node currentNode = head;
        for (int i = 1; i < pos-1; ++i){
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        if ( currentNode.next != null){
            currentNode.next.prev = newNode;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }
    int countNodes (){
        int result = 0;
        Node currentNode = head;
        while ( currentNode != null){
            result++;
            currentNode = currentNode.next;
        }
        return result;
    }

    void displayForward () {
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("End/null");
    }

    void displayReverse () {
        // find tail
        Node tail = head;
        while ( tail.next != null){
            tail = tail.next;
        }

        //print in reverse
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("Start/null ");
    }
}
