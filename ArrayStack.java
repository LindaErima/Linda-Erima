package org.example;

// Implementation of a stack using arrays

import java.util.Scanner;

public class ArrayStack {

    private final int[] array;
    private final int size; // number of items the array can hold
    private int top;

    public ArrayStack(int capacity) {
        size = capacity;
        array = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int dataItem) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
//            array[++top] = dataItem;
            top++;
            array[top] = dataItem;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty!");
        }
        top--;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("!Stack is empty");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public void arrayStack() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter data items: ");
        int i = 0;
        while (i < size) {
            push(input.nextInt());
            i++;
        }
        display();
    }

}


