package com.dsa.queue;

public class CustomQueue {
    private int[] arr;
    private int  rear;
    private static final int DEFAULT_SIZE = 5;
    public CustomQueue () {
        this.arr = new int[DEFAULT_SIZE];
        this.rear = -1;
    }
    public CustomQueue (int size) {
        this.arr = new int[size];
        this.rear = -1;
    }

    void deque (){
        if (isEmpty()){
            System.out.println("Already Empty");
            return;
        }
        for (int i = 1; i <= rear; ++i){
            arr[i-1] = arr[i];
        }
        rear--;
    }

    void enqueue (int val){
        if (isFull()){
            System.out.println("Space Not available");
            return;
        }
        arr[++rear] = val;
    }

    void peek () {
        System.out.println(arr[0]);
    }

    void display () {
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    boolean isFull() {
        return rear == arr.length-1;
    }

    boolean isEmpty(){
        return rear == -1;
    }

}
