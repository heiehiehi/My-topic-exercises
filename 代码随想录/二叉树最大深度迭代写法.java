package 代码随想录;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 二叉树最大深度迭代写法 {
    public static void main(String[] args) {

    }
    public static int maxDepth(TreeNode root) {
        if (root==null)return 0;
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0;i<len;i++){
                TreeNode temp = queue.poll();
                if (temp.left!=null)queue.add(temp.left);
                if (temp.right!=null)queue.add(temp.right);
            }
            depth++;
        }
        return depth;
    }
}
