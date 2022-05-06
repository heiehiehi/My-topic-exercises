package 代码随想录;

public class 二叉搜索数的最近公共祖先 {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)return root;
        if (root.val>p.val&&root.val>q.val){
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            if (left!=null){
                return left;
            }
        }
        if (root.val<p.val&&root.val<q.val){
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            if (right!=null){
                return right;
            }
        }
        return root;
    }
}
