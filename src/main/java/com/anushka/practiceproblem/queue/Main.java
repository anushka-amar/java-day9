package com.anushka.practiceproblem.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.display();
        System.out.println(queue.size());
    }
}
