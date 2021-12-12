// Created by Intellij IDEA
// Author Name: KULDEEP SINGH (kuldeep506)
// Date: 11-12-2021

package stackusinglinkedlist;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

    public Stack() {
        stack=new LinkedList<>();
    }
    /**method to add an element in stack*/
    public void push(int data){
        stack.add(data);
    }
    /**method to remove an element in stack*/
    public void pop(){
        if (stack.isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        stack.removeLast();
    }

    /**method to look top element in stack*/
    public void peek(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(stack.getLast());
    }
}
