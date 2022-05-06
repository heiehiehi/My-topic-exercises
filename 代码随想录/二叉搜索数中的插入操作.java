package 代码随想录;

public class 二叉搜索数中的插入操作 {
    public static void main(String[] args) {

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null){
            return new TreeNode(val);
        }
        helper(root,val);
        return root;
    }
    public static void helper(TreeNode root,int val){
        if (root.val>val){
            if (root.left==null){
                root.left = new TreeNode(val);
                return;
            }
            else {
                helper(root.left,val);
            }
        }
        else {
            if (root.right==null){
                root.right = new TreeNode(val);
                return;
            }
            else {
                helper(root.right,val);
            }
        }
    }
}
