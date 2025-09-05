package com.dsa.linkedlist2;

public class ReverseLL {
    class Node {
        int value;
        Node next;

        public Node (int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    int size;
    public ReverseLL () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void display () {
        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }
    public void insertFirst (int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null){
            tail = head;
        }
    }
    public void reverseList () {
        Node prevNode = null;
        Node currentNode = head;

        while (currentNode != null){
            Node temp = currentNode.next; //Stores the current node
            currentNode.next = prevNode; // reverse the link
            prevNode = currentNode;     // update the previous node
            currentNode = temp;         // update the current node
        }
        head = prevNode; // The original head now sits the tail of the reversed
                         // list (it points to null after being flipped).
    }
}
