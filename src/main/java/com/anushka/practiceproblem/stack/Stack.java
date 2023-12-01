package com.anushka.practiceproblem.stack;

public class Stack {

    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(int data){
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(data+ " pushed into the stack sucessfully!");
    }

    public void display_stack(){
        Node current = top;

        if(isEmpty()){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Stack:-");
        while (current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
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
