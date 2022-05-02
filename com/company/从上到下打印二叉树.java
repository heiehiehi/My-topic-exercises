package com.company;

import java.util.*;

public class 从上到下打印二叉树 {
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
        System.out.println(Arrays.toString(levelOrder(A)));

    }
    public static int[] levelOrder(TreeNode root) {
        if (root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            int count = queue.size();
            for (int i = 0;i<count;i++){
                TreeNode temp = queue.poll();
                ans.add(temp.val);
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
        int ans2[] = new int[ans.size()];
        for (int i = 0;i<ans.size();i++){
            ans2[i] = ans.get(i);
        }
        return ans2;
    }
    public static List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            int count = queue.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0;i<count;i++){
                TreeNode temp = queue.poll();
                res.add(temp.val);
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
            }
            ans.add(res);
        }
        return ans;
    }
    public static List<List<Integer>> levelOrder3(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = false;
        while (!queue.isEmpty()){
            int count = queue.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0;i<count;i++){
                TreeNode temp = queue.poll();
                res.add(temp.val);
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
            }
            ans.add(res);
        }
        for (int i = 1;i<ans.size();i+=2){
            Collections.reverse(ans.get(i));
        }
        return ans;
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
