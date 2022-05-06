package 代码随想录;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的所有路径迭代写法 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(5);
        A.left = B;
        B.right = D;
        A.right = C;
        System.out.println(binaryTreePaths(A).toString());
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        Stack<String> res = new Stack<>();
        res.add(root.val+"");
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            String path = res.pop();
            if (temp.left==null&&temp.right==null){
                ans.add(path);
            }
            if (temp.right!=null){
                stack.add(temp.right);
                res.add(path+"->"+temp.right.val);
            }
            if (temp.left!=null){
                stack.add(temp.left);
                res.add(path+"->"+temp.left.val);
            }
        }
        return ans;
    }
}
