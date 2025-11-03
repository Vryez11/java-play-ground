package main.java.study.mid2.collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("stack.peek() = " + stack.peek());

        while(!stack.empty()) {
            System.out.println("stack.pop() = " + stack.pop());
        }
        System.out.println(stack);
    }
}
