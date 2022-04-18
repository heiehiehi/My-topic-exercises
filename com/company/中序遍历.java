package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 中序遍历 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        A.right = B;
        B.left = C;
        List<Integer> ans = inorderTraversal(A);
        for (Integer i:ans){
            System.out.println(i);
        }

    }
    //迭代算法算中序遍历
    public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Boolean> stack1 = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        stack.add(root);
        stack1.add(true);
        while (!stack.isEmpty()){
            if (stack.peek().left!=null && stack1.peek()){
                stack.add(stack.peek().left);
                stack1.pop();
                stack1.add(false);
                stack1.add(true);
            }
            else {
                ans.add(stack.peek().val);
                if (stack.peek().right!=null){
                    TreeNode temp = stack.peek().right;
                    stack.pop();
                    stack1.pop();
                    stack.add(temp);
                    stack1.add(true);
                }
                else {
                    stack.pop();
                    stack1.pop();
                }
            }
        }
        return ans;
    }
}
