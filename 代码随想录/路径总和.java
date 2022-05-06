package 代码随想录;

public class 路径总和 {
    public static void main(String[] args) {

    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0,targetSum);
    }
    public static boolean helper(TreeNode node,int sum,int targetSum){
        sum += node.val;
        if ((node.left==null&&node.right==null)&&sum == targetSum){
            return true;
        }
        else {
            boolean left;
            if (node.left==null){
                left = false;
            }
            else {
                left = helper(node.left,sum,targetSum);
            }
            boolean right;
            if (node.right==null){
                right = false;
            }
            else {
                right = helper(node.right,sum,targetSum);
            }
            return left||right;
        }

    }
}
