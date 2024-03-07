package org.example;

public class ArrayQueue {
    private final int[] array;
    int size;
    int front;
    int rear;

    ArrayQueue(int size) {
        this.size = size;
        this.array = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int dataItem) {
        if (isFull()) {
            System.out.println("Queue is full");
        }

        if (isEmpty()) {
            rear = 0;
            front = 0;
        } else {
            rear = ( rear + 1 ) % size;
        }
        array[rear] = dataItem;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue already empty");
        }

        int element = array[front];
        // If the queue has only one element, set the front and rear to -1
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Increment the front index and wrap around if necessary
            front = (front + 1) % size;
        }
        // Return the element
        return element;
    }

    public int peek() {
        // Check if the queue is empty
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        // Return the element at the front of the queue
        return array[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Array queue is empty");
        }

        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + "\t");
            i++;
        }
    }

    public void arrayQueue() {
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        display();
    }
}




