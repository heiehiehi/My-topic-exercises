package 代码随想录;

public class 二叉树的最大深度 {
    public static void main(String[] args) {

    }
    public static int maxDepth(TreeNode root) {
        return getDepth(root);
    }
    public static int getDepth(TreeNode node){
        if (node==null)return 0;
        int leftdepth = getDepth(node.left);
        int rightdepth = getDepth(node.right);
        return 1+Math.max(leftdepth,rightdepth);
    }

}
