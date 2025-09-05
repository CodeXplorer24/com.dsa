package com.dsa.queue;

public class Main {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(10);

        queue.peek();

        queue.display();

        queue.deque();
//        queue.deque();

        queue.display();
    }
}
