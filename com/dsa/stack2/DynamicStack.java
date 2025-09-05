package com.dsa.stack2;

public class DynamicStack extends CustomStack {

    public DynamicStack () {
        super();
    }
    public DynamicStack (int size ){
        super(size);
    }

    @Override
    public void push (int val) {
        // If stack array is full then increase its size to twice
        if (isFull()){
            int[] tempArr = new int[2 * stackArr.length];

            for (int i = 0; i < stackArr.length; ++i ){
                tempArr[i] = stackArr[i];
            }
            stackArr = tempArr; // stackArr is updated with new size
        }

        stackArr[++top] = val;
    }
}
