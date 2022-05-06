package 代码随想录;

import java.util.ArrayList;
import java.util.List;

public class 二叉树所有路径 {
    public static void main(String[] args) {

    }
    public List<String> binaryTreePaths(TreeNode root) {
        String start = "";
        List<String> ans = new ArrayList<>();
        helper(ans,start,root);
        return ans;
    }
    public static void helper(List<String> ans,String res,TreeNode root){
        if (root.left==null&&root.right==null){
            res+=root.val;
            ans.add(res);
            return;
        }
        else {
            res+=root.val+"->";
        }
        if (root.left!=null)helper(ans,res,root.left);
        if (root.right!=null)helper(ans,res,root.right);
    }
}
