package 代码随想录;

public class 二叉树的最小深度 {
    public static void main(String[] args) {

    }
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return getdepth(root);
    }
    public static int getdepth(TreeNode node){
        if (node.right==null&&node.left==null)return 1;
        if (node.right==null){
            return 1+getdepth(node.left);
        }
        else if (node.left==null){
            return 1+getdepth(node.right);
        }
        else {
            int leftNode = getdepth(node.left);
            int rightNode = getdepth(node.right);
            return 1+Math.min(leftNode,rightNode);
        }
    }
}
