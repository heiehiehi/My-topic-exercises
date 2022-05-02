package com.company;

import java.util.Stack;

public class 用两个栈实现队列 {
    public static void main(String[] args) {
        CQueue A1 = new CQueue();
        A1.appendTail(2);
        System.out.println(A1.deleteHead());
    }
}
class CQueue {
    Stack<Integer> n1 = new Stack<>();
    Stack<Integer> n2 = new Stack<>();
    public CQueue() {

    }

    public void appendTail(int value) {
        while (!n2.isEmpty()){
            n1.add(n2.pop());
        }
        n1.add(value);
    }

    public int deleteHead() {
        while (!n1.isEmpty()){
            n2.add(n1.pop());
        }
        if (n2.isEmpty()){
            return -1;
        }
        else {
            return n2.pop();
        }
    }
}