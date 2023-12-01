package com.anushka.learningproblem;

public class LL {
    private Node head;
    private int size;
    public LL(){
        this.size = 0;
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }
}
