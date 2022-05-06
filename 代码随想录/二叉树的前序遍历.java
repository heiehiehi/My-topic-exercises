package 代码随想录;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的前序遍历 {
    public static void main(String[] args) {

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        helper(ans,root);
        return ans;
    }
    public static void helper(List<Integer> ans,TreeNode node){
        if (node==null){
            return;
        }
        ans.add(node.val);
        helper(ans,node.left);
        helper(ans,node.right);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }