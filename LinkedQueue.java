package org.example;

class QueueNode {
    int dataItem;
    QueueNode next;
    QueueNode tail;

    public QueueNode(int data) {
        this.dataItem = data;
        this.next = null;
        this.tail = null;
    }
}

public class LinkedQueue {
    private QueueNode front;
    private QueueNode rear;

    public LinkedQueue() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (isEmpty()) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is already empty");
        }
        int data = front.dataItem;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("! Stack is empty");
        }
        System.out.println("Queue items: " + front.dataItem);
    }

    public void linkedQueue() {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();

        dequeue();
        display();
    }
}
