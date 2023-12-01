package com.anushka.practiceproblem.stack;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(70);
        st.push(30);
        st.push(56);
        st.display_stack();

        System.out.println("\nTop Element "+st.peek());
        System.out.println("popped "+st.pop()+" from the stack");

        st.display_stack();
    }

}
