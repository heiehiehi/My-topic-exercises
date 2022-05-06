package 代码随想录;

public class 平衡二叉树 {
    public static void main(String[] args) {

    }
    public static boolean isBalanced(TreeNode root) {
        int result = helper(root);
        if (result==-1){
            return false;
        }
        else {
            return true;
        }
    }
    public static int helper(TreeNode node){
        if (node == null)return 0;
        int leftdepth = helper(node.left);
        if (leftdepth == -1)return -1;
        int rightdepth = helper(node.right);
        if (rightdepth == -1)return -1;

        if (Math.abs(leftdepth-rightdepth)>1){
            return -1;
        }
        else {
            return 1+Math.min(leftdepth,rightdepth);
        }
    }
}
