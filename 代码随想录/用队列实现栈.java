package 代码随想录;

import java.util.LinkedList;
import java.util.Queue;

public class 用队列实现栈 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
    static class MyStack {
        Queue<Integer> queue1;
        Queue<Integer> queue2;
        int size;
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
            size = 0;
        }

        public void push(int x){
            if (queue1.isEmpty()){
                while (!queue2.isEmpty()){
                    queue1.add(queue2.poll());
                }
            }
            queue1.add(x);
            size++;
        }

        public int pop() {
            if (queue1.isEmpty()){
                while (!queue2.isEmpty()){
                    queue1.add(queue2.poll());
                }
            }
            int len = --size;
            while (len != 0){
                queue2.add(queue1.poll());
                len--;
            }
            return queue1.poll();
        }

        public int top() {
            if (queue1.isEmpty()){
                while (!queue2.isEmpty()){
                    queue1.add(queue2.poll());
                }
            }
            int len = size-1;
            while (len != 0){
                queue2.add(queue1.poll());
                len--;
            }
            int temp = queue1.poll();
            queue2.add(temp);
            return temp;
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
}
