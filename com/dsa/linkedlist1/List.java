package com.dsa.linkedlist1;

public class List {

    private class Node  {
        int value;
        Node next;

        public Node (int value){
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    public int size;

    public List () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void display () {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + "->");
            currentNode = currentNode.next;
        }
        System.out.println("End");
    }

    public void insertFirst (int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if ( tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast (int value) {
        if ( tail == null) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void deleteFirst (){
        if ( head == null){
            return; // List is already empty
        }
        head = head.next;
        if (head == null){
            tail = null; // List become empty;
        }
        size--;
    }
    public void deleteLast () {
        Node temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void insertAt (int value, int index) {
        if ( index == 0) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index-1; ++i){
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next; // first connect newNode to the next node
        temp.next = newNode; // then connect temp to newNode
        size++;
    }

    public void deleteAt (int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == size){
            deleteLast();
            return;
        }

        if (index == 1) {
            deleteFirst();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index-1; ++i){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public boolean searchVal (int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int findMid () {
        Node temp = head;
        int n = 1;
        while ( n != size/2){
            temp = temp.next;
            n++;
        }
        return temp.value;
    }

    public int findMid_2 () {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public int countNodes () {
        Node currentNode = head;
        int count = 0;
        while (currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }


}
