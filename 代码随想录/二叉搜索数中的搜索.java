package 代码随想录;

import java.util.LinkedList;
import java.util.Queue;

public class 二叉搜索数中的搜索 {
    public static void main(String[] args) {

    }
    public static TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node;
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0;i<len;i++){
                node = queue.poll();
                if (node.val==val)return node;
                if (node.right!=null)queue.add(node.right);
                if (node.left!=null)queue.add(node.left);
            }
        }
        return null;
    }
}
