// Created by Intellij IDEA
// Author Name: KULDEEP SINGH (kuldeep506)
// Date: 09-12-2021

package stackusingarray;

public class Stack {
    private int[] arr;
    private int sp;

    public Stack(int size) {
        this.arr = new int[size];
        this.sp=-1;
    }

    /** method to add elements in stack*/
    public void push(int data){
        if(sp>=arr.length-1){
            System.out.println("Stack Overflow");
        }else
        arr[++sp]=data;
    }

    /** method to remove elements in stack*/
    public void pop(){
        if(sp<0){
            System.out.println("Stack Underflow");
        }else
        sp--;
    }

    /** method to look top elements in stack*/
    public void peek(){
        if(sp==-1){
            System.out.println("Stack is Empty");
        }else
        System.out.println(arr[sp]);
    }

    /**method to check stack is empty or not*/
    public boolean isEmpty(){
        return sp < 0;
    }
}
