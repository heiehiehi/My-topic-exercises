package 代码随想录;

import java.util.Stack;

public class 用栈实现队列 {

}
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public void push(int x) {
        if (stack1.isEmpty()){
            while (!stack2.isEmpty()){
                stack1.add(stack2.pop());
            }
        }
        size++;
        stack1.add(x);
    }

    public int pop() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
        }
        size--;
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        if (size==0){
            return true;
        }
        else {
            return false;
        }
    }
}