package com.anushka.learningproblem;

public class LL {
    private Node head;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            node.next = null;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void displayLL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }
}
