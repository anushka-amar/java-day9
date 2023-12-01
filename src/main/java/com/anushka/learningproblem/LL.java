package com.anushka.learningproblem;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = head;
            node.next = null;
            size++;
            return;
        }
        node.next = head;
        tail = head;
        head = node;
        size++;
    }

    public void append(int data){
        Node node = new Node(data);
        if(size==0){
            addFirst(data);
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    public void insert_middle(int data){
        Node node = new Node(data);
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        int index = (size/2)-1;
        Node temp = head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int pop(){
        if(size==0){
            System.out.println("List already is empty");
            return 0;
        }
        int val = head.data;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int popLast(){
        if(size<=1){
            return pop();
        }
        int val = tail.data;
        Node temp = head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int search(int val){
        Node temp = head; int index=0;
        System.out.println("Searching for "+val);
        while (temp!=null){
            if(temp.data == val){
                System.out.println("Element found at "+index);
                return index;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("Element not found!");
        return -1;
    }

    public void insertAtPos(int val, int key){
        int index = search(key);
        Node temp = head, node = new Node(val);

        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

        if(index>-1){
            size++;
        }
    }

    public void popAtpos(int key){
        Node prev=head, temp=head;
        int index = search(key);
        for(int i=0; i<index; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
        if(index>-1){
            size--;
        }
        System.out.println("Now the size of the linkedlist is "+getSize());
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
        System.out.print("NULL\n");
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }
}
