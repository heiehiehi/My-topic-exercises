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
        List<List<Integer>> ans = zigzagLevelOrder(E);
        for (List i :ans){
            System.out.println(i.toString());
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        List<Integer> res2 = new ArrayList<>();
        res2.add(root.val);
        ans.add(res2);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean flag = true;

        while (!queue.isEmpty()){
            TreeNode left = queue.peek().left;
            TreeNode right = queue.peek().right;
            List<Integer> res = new ArrayList<>();
            if (left==null&&right==null){}
            else if (flag){
                if (left == null && right != null){
                    res.add(right.val);
                }
                else if (left != null && right == null){
                    res.add(left.val);
                }
                else {
                    res.add(right.val);
                    res.add(left.val);
                }
                flag = !flag;
            }
            else{
                if (left == null && right != null){
                    res.add(right.val);
                }
                else if (left != null && right == null){
                    res.add(left.val);
                }
                else {
                    res.add(left.val);
                    res.add(right.val);
                }
                flag = !flag;
            }

            if (!res.isEmpty()){
                ans.add(res);
            }

            if (left!=null){
                queue.add(left);
            }
            if (right!=null){
                queue.add(right);
            }
            queue.poll();
        }

        return ans;
    }
}
