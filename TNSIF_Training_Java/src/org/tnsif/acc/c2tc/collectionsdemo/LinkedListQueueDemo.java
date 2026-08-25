package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // add() - adds elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue: " + queue);

        // peek() - accesses front element
        System.out.println("Front element: " + queue.peek());

        // contains() - checks element
        System.out.println("Contains 20: " + queue.contains(20));

        // size() - number of elements
        System.out.println("Size: " + queue.size());

        // remove() - removes front element
        System.out.println("Removed element: " + queue.remove());

        System.out.println("Queue after remove: " + queue);

        // isEmpty() - checks whether empty
        System.out.println("Is queue empty: " + queue.isEmpty());

        // clear() - removes all elements
        queue.clear();

        System.out.println("Queue after clear: " + queue);
    }
}


