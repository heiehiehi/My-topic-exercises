package 代码随想录;

import java.util.LinkedList;
import java.util.Queue;

public class 合并二叉树迭代实现 {
    public static void main(String[] args) {

    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)return root2;
        if(root2==null)return root1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root1);
        queue.add(root2);
        while (!queue.isEmpty()){
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            node1.val +=node2.val;
            if (node1.right!=null&&node2.right!=null){
                queue.add(node1.right);
                queue.add(node2.right);
            }
            if (node1.left!=null&&node2.left!=null){
                queue.add(node1.left);
                queue.add(node2.left);
            }
            if (node1.left==null&&node2.left!=null){
                node1.left = node2.left;
            }
            if (node1.right==null&&node2.right!=null){
                node1.right = node2.right;
            }
        }
        return root1;
    }
}
