package 代码随想录;

import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的最小深度迭代算法 {
    public static void main(String[] args) {

    }
    public int minDepth(TreeNode root) {
        if (root==null)return 0;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0;i<len;i++){
                TreeNode temp = queue.poll();
                if (temp.left==null&&temp.right==null){
                    return depth+1;
                }
                if (temp.left!=null)queue.add(temp.left);
                if (temp.right!=null)queue.add(temp.right);
            }
            depth++;
        }
        return depth;
    }
}
