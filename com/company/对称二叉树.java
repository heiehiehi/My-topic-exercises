package com.company;

public class 对称二叉树 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(2);
        TreeNode D = new TreeNode(3);
        TreeNode E = new TreeNode(3);
        A.left = B;
        A.right = C;
        System.out.println(isSymmetric(A));
    }
    public static boolean isSymmetric(TreeNode root) {
        return panduan(root.left,root.right);
    }
    public static boolean panduan(TreeNode left,TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left!=null&&right==null||left==null&&right!=null){
            return false;
        }
        if (left.val==right.val){
            return panduan(left.left,right.right)&&panduan(left.right,right.left);
        }
        else {
            return false;
        }
    }
}
