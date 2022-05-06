package 代码随想录;

public class 修剪二叉搜索树 {
    public static void main(String[] args) {

    }
    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null){
            return null;
        }
        if (root.val>high){
            TreeNode left = trimBST(root.left,low,high);
            return left;
        }
        if (root.val<low){
            TreeNode right = trimBST(root.right,low,high);
            return right;
        }
        root.right = trimBST(root.right,low,high);
        root.left = trimBST(root.left,low,high);
        return root;
    }
}
