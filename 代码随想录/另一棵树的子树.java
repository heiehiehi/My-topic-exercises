package 代码随想录;

public class 另一棵树的子树 {
    public static void main(String[] args) {

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null){
            return false;
        }
        if (root.val == subRoot.val){
            return compare(root,subRoot);
        }
        else {
            return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
        }
    }
    public boolean compare(TreeNode root, TreeNode subRoot){
        if (root==null&&subRoot==null){
            return true;
        }
        else if (root!=null&&subRoot==null||root==null&&subRoot!=null){
            return false;
        }
        else if (root.val == subRoot.val){
            return compare(root.left,subRoot.left)&&compare(root.right,subRoot.right);
        }
        else {
            return false;
        }
    }
}
