package com.dsa.linkedlist;

public class LL {

    // 1. Node Class – holds data and reference to the next node
    private class Node {
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
            this.next = null;
        }
        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    // 2. Fields – head, tail, and size of the list
    private Node head;
    private Node tail;
    private int size;

    // 3. Constructor – initializes an empty Linked list
    public LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // 4. addFirst – insert new node at the beginning
   public void insertFirst (int value){
        Node newNode = new Node(value); // initialise the Node having refrence and value
        newNode.next = head; //
        head = newNode;

        if (tail == null){
            tail = head;
        }
        size += 1;
   }

   // 5. addLast - It adds the new element to the last node
    public void insertLast (int value){
        if ( tail == null){
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value); // initialise the Node class that have reference and value
        tail.next = newNode; //
        tail = newNode; //
        size++;
    }
    // 6. Insertion at specific place
    public void insertAt (int index, int value){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; ++i){
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;
    }

    // 7.
    public void deleteFirst (){

    }

   // . Print elements of Linked List
    public void printElements (){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }





}