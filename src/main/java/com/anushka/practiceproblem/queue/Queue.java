package com.anushka.practiceproblem.queue;

public class Queue {
    private Node front, back;
    private int size;

    public Queue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            back = newNode;
            size++;
            return;
        }
        back.next = newNode;
        back = newNode;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to dequeue");
            return 0;
        }
        int dequeued_val = front.data;
        front = front.next;
        return dequeued_val;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("The queue is empty, please insert first");
            return;
        }
        Node curr = front;
        System.out.println("Queue is:- ");
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("\n");
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
