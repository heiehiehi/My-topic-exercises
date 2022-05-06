package 代码随想录;

public class 二叉搜索数的最小绝对差中序遍历 {
    public static void main(String[] args) {

    }
    int minabs = Integer.MAX_VALUE;
    TreeNode pre;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return minabs;
    }
    public void helper(TreeNode node){
        if (node.left!=null){
            helper(node.left);
        }
        if (pre!=null){
            if (minabs>Math.abs(pre.val-node.val)){
                minabs = Math.abs(pre.val-node.val);
            }
        }
        pre = node;
        if (node.right!=null){
            helper(node.right);
        }
    }
}
