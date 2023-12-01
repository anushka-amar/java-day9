package com.anushka.practiceproblem.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.display();
        System.out.print("size of the queue is "+queue.size());

        System.out.println("\nDequeued item is "+queue.dequeue());
        queue.display();
    }
}
