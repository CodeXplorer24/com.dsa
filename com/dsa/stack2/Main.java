package com.dsa.stack2;

public class Main {
    public static void main(String[] args)  {
        DynamicStack stack = new DynamicStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // overflow but not in dynamic stack
        stack.push(7); // overflow

        stack.display();
        stack.peek();

    }
}
