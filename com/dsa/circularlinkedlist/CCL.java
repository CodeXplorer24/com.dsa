package com.dsa.circularlinkedlist;

public class CCL {

    private class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
        public Node (int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private Node tail;

    public CCL () {
        this.tail = null;
    }

    void insertFirst (int val){
        Node newNode = new Node(val);
        if (tail == null){
            tail = newNode;
            tail.next = tail;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;

    }

    void insertLast (int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode; // only change from insertFist()

    }

    void deleteFirst () {
        if ( tail == null){
            System.out.println("List is already empty");
            return;
        }
        tail.next = tail.next.next;
    }

    void deleteLast () {
        if ( tail == null){
            System.out.println("List is already empty");
            return;
        }
        Node curr = tail;
        while (curr.next.next != tail.next){
            curr = curr.next;
        }
        curr.next = tail.next;
        tail = curr;
    }

    void display () {
        Node head = tail.next; //start from head
        do{
            System.out.print(head.data + " -> ");
            head = head.next;
        } while ( head != tail.next); // loop untill circle back to head
        System.out.println("tail ->");
    }
}
