package com.company;

import java.util.*;

public class 二叉树的锯齿形层次遍历 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(3);
        TreeNode B = new TreeNode(9);
        TreeNode C = new TreeNode(20);
        TreeNode D = new TreeNode(15);
        TreeNode E = new TreeNode(7);
        A.left = B;
        A.right = C;
        C.left = D;
        C.right = E;
        List<List<Integer>> ans = zigzagLevelOrder(A);
        for (List i :ans){
            System.out.println(i.toString());
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = true;
        queue.add(root);

        while (!queue.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int count = queue.size();
            for (int i = 0;i<count;i++){
                TreeNode left = queue.peek().left;
                TreeNode right = queue.peek().right;
                TreeNode node = queue.poll();
                if (left!=null){
                    queue.add(left);
                }
                if (right!=null){
                    queue.add(right);
                }
                if (flag){
                    res.add(node.val);
                }
                else {
                    res.add(0,node.val);
                }
            }
            ans.add(res);
            flag = !flag;
        }
        return ans;
    }
}
