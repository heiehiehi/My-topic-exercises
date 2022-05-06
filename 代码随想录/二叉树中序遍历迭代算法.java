package 代码随想录;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树中序遍历迭代算法 {
    public static void main(String[] args) {

    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root==null)return ans;

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if (temp != null){
                if (temp.right!=null)stack.add(temp.right);
                stack.add(temp);
                stack.add(null);
                if (temp.left!=null)stack.add(temp.left);
            }
            else {
                ans.add(stack.pop().val);
            }
        }
        return ans;
    }
}
