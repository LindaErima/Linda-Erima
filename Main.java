package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.arrayStack();

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.linkedStack();

        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.arrayQueue();

        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.linkedQueue();

        PriorityQ priorityQ = new PriorityQ();
        priorityQ.priorityQ();
    }
}