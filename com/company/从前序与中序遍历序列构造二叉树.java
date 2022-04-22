package com.company;

import java.util.ArrayList;
import java.util.List;

public class 从前序与中序遍历序列构造二叉树 {
    public static void main(String[] args) {
        int preorder[] = {3,9,20,15,7};
        int inorder[] = {9,3,15,20,7};
        buildTree(preorder,inorder);
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        //首先获取头节点
        List<Integer> preorder1 = new ArrayList<>();
        List<Integer> inorder2 = new ArrayList<>();
        for (int i = 0;i<preorder.length;i++){
            preorder1.add(preorder[i]);
            inorder2.add(inorder[i]);
        }
        TreeNode root = created(preorder1,inorder2);
        return root;
    }
    public static TreeNode created(List<Integer> preorder,List<Integer> inorder){
        //读取第一个节点
        if (inorder.isEmpty()){
            return null;
        }
        TreeNode node = new TreeNode(preorder.get(0));
        //在前序移除第一个节点
        preorder.remove(0);
        //找到node在inorder的位置
        int mid = inorder.indexOf(node.val);
        //截取中序遍历左边节点
        List<Integer> leftinorder = inorder.subList(0,mid);
        //截取node在inorder的位置
        List<Integer> rightinorder = inorder.subList(mid+1,inorder.size());
        //连接左节点
        node.left = created(preorder,leftinorder);
        //连接右节点
        node.right = created(preorder,rightinorder);
        //放回节点
        return node;
    }
}
