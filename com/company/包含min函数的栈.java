package com.company;

import java.util.Stack;

public class 包含min函数的栈 {
    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.min());
    }
}
class MinStack2 {
    Stack<Integer> n1;
    Stack<Integer> n2;
    /** initialize your data structure here. */
    public MinStack2() {
        n1 = new Stack<>();
        n2 = new Stack<>();
    }

    public void push(int x) {
        if (n2.isEmpty()){
            n2.add(x);
            n1.add(x);
            return;
        }
        n1.add(x);
        if (x<=n2.peek()){
            n2.add(x);
        }
    }

    public void pop() {
        int one = n1.peek();
        int two = n2.peek();
        if (one==two){
            n1.pop();
            n2.pop();
        }
        else {
            n1.pop();
        }
    }

    public int top() {
        return n1.peek();
    }

    public int min() {
        return n2.peek();
    }
}
