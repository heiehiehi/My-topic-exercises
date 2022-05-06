package 代码随想录;

import java.util.*;

public class 二叉树的前序遍历迭代算法 {
    public static void main(String[] args) {

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root==null){
            return ans;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            ans.add(temp.val);
            if (temp.left!=null)stack.add(temp.left);
            if (temp.right!=null)stack.add(temp.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}
