package com.company;

import java.util.PriorityQueue;

public class 二叉搜索树中第K小的元素 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(3);
        TreeNode B = new TreeNode(1);
        TreeNode C = new TreeNode(4);
        TreeNode D = new TreeNode(2);
        A.left = B;
        A.right = C;
        B.right = D;
        System.out.println(kthSmallest(A,3));

    }
    public static int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        helper(ans,root);
        for (int i = 0;i<k-1;i++){
            ans.poll();
        }
        return ans.poll();
    }
    public static void helper(PriorityQueue arr,TreeNode node){
        if (node==null){
            return;
        }
        arr.add(node.val);
        helper(arr,node.left);
        helper(arr,node.right);
    }
}
