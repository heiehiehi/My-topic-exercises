package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历 {
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
        List<List<Integer>> ans = levelOrder(A);
        for (List list:ans){
            for (Object j:list){
                System.out.println(j);
            }
        }

    }
    //BFS解决
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        //队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            int Number = queue.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0;i<Number;i++){
                TreeNode node = queue.poll();
                res.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            ans.add(res);
        }
        return ans;
    }
    //DFS解决
    public static List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        //队列
        List<List<Integer>> ans = new ArrayList<>();
        geta(root,0,ans);
        return ans;
    }
    public static void geta(TreeNode node,int n,List<List<Integer>> ans){
        if (node!=null){
            return;
        }
        if (n>=ans.size()){
            List<Integer> list = new ArrayList<>();
            ans.add(list);
        }
        ans.get(n).add(node.val);
        geta(node.left,n+1,ans);
        geta(node.right,n+1,ans);
    }
}
