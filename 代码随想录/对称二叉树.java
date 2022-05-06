package 代码随想录;

import java.util.Stack;

public class 对称二叉树 {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return false;
        Stack<TreeNode> stack = new Stack<>();

        stack.add(root.left);
        stack.add(root.right);
        while (!stack.isEmpty()){
            TreeNode rightNode = stack.pop();
            TreeNode leftNode = stack.pop();
            if (leftNode==null&&rightNode==null){
                continue;
            }
            if ((leftNode==null&&rightNode!=null)||(leftNode!=null&&rightNode==null)||(leftNode.val!= rightNode.val)){
                return false;
            }
            stack.add(rightNode.right);
            stack.add(leftNode.left);
            stack.add(leftNode.right);
            stack.add(rightNode.left);
        }
        return true;
    }
}
