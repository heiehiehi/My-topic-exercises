package 代码随想录;

import java.util.Stack;

public class 翻转数 {
    public static void main(String[] args) {

    }
//    public TreeNode invertTree(TreeNode root) {
//        helper(root);
//        return root;
//    }
//    public static void helper(TreeNode node){
//        if (node!=null){
//            TreeNode temp = node.right;
//            node.right = node.left;
//            node.left = temp;
//        }
//        else {
//            return;
//        }
//        helper(node.left);
//        helper(node.right);
//    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        Stack<TreeNode> stack =new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            swap(temp);
            if (temp.right!=null)stack.add(temp.right);
            if (temp.left!=null)stack.add(temp.left);
        }
       return root;
    }
    public static void swap(TreeNode node){
        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;
    }
}
