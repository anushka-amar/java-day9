package com.anushka.learningproblem;

public class Main {
    public static void main(String[] args) {
     LL list1 = new LL();
     list1.addFirst(70);
     list1.addFirst(30);
     list1.addFirst(56);

     LL list2 = new LL();
     list2.append(56);
     list2.append(70);
     list2.insert_middle(30);
     list2.displayLL();
     System.out.println(list2.popLast()); //functionality to delete first node
     list2.displayLL();
     list2.search(30);

    }
}
