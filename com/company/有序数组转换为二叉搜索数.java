package com.company;

public class 有序数组转换为二叉搜索数 {
    public static void main(String[] args) {
        int nums[] = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(nums[nums.length/2]);
        root.left = creat(nums,0,nums.length/2-1);
        root.right = creat(nums,nums.length/2+1,nums.length-1);
        return root;
    }
    public static TreeNode creat(int[] nums,int start,int end){
        int mid = (end+start)/2;
        if (start>end){
            return null;
        }
        TreeNode node = new TreeNode(nums[mid]);
        node.left = creat(nums,start,mid-1);
        node.right = creat(nums,mid+1,end);
        return node;
    }
}

