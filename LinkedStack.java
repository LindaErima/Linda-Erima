package org.example;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedStack {
    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int value) {
        Node dataItem = new Node(value);
        dataItem.next = tail;
        head = dataItem;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        int value = head.value;

        head = head.next;
        return value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack already empty!");
        }

        System.out.println(head.value);
    }

    public void linkedStack() {
        push(10);
        push(20);
        push(30);
        push(40);

        pop();

        System.out.println("Stack elements: ");
        display();
    }
}






