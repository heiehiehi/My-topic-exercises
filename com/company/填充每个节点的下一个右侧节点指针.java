package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 填充每个节点的下一个右侧节点指针 {
    public static void main(String[] args) {
        Node A = new Node(3);
        Node B = new Node(9);
        Node C = new Node(20);
        Node D = new Node(15);
        Node E = new Node(7);
        A.left = B;
        A.right = C;
        C.left = D;
        C.right = E;
        connect(A);
    }
    public static Node connect(Node root) {
        if (root == null){
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            for (int i = 0;i<count;i++){
                Node left = queue.peek().left;
                Node right = queue.peek().right;

                if (i!=count-1){
                    Node node = queue.poll();
                    node.next = queue.peek();
                }
                else {
                    Node node = queue.poll();
                    node.next = null;
                }

                if (left!=null){
                    queue.add(left);
                }
                if (right!=null){
                    queue.add(right);
                }
            }
        }
        return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
