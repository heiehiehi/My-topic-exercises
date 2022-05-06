package 代码随想录;

public class 二叉树的最近公共主线 {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==p||root==q||root==null)return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left==null&&right!=null)return right;
        if (right==null&&left!=null)return left;
        if (right!=null&&left!=null)return root;
        return null;
    }
}
