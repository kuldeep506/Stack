// Created by Intellij IDEA
// Author Name: KULDEEP SINGH (kuldeep506)
// Date: 11-12-2021

package stackusingarray;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
//        stack.peek();
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(9);
//        stack.push(10);
        stack.pop();
        stack.peek();
    }
}
