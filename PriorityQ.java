package org.example;

import java.util.PriorityQueue;



public class PriorityQ {
    static class DataItem {
        private int value;
        private int priority;

        public DataItem(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }
    PriorityQueue<DataItem> queue = new PriorityQueue<>();

    public void enqueue(DataItem dataItem) {
        queue.add(dataItem);
    }

    public int getSize() {
        return queue.size();
    }

    public void display() {
        while (getSize() > 0) {
            System.out.print(queue + "\t");
        }
    }

    public void priorityQ() {
        DataItem dataItem = new DataItem(20, 1);
        DataItem dataItem1 = new DataItem(30, 3);
        DataItem dataItem2 = new DataItem(60, 2);

        enqueue(dataItem);
        enqueue(dataItem1);
        enqueue(dataItem2);
    }


}
