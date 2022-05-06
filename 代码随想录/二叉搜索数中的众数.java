package 代码随想录;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 二叉搜索数中的众数 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(2);
        A.right = B;
        B.left = C;
        System.out.println(Arrays.toString(findMode(A)));
    }
    static int count = 1;
    static int nowMax = 1;
    static TreeNode pre;
    static List<TreeNode> list = new ArrayList<>();
    public static int[] findMode(TreeNode root) {
        helper(root);
        int ans[] = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            ans[i] = list.get(i).val;
        }
        return ans;
    }
    public static void helper(TreeNode node){
        if (node.left!=null){
            helper(node.left);
        }
        if (pre!=null){
            if (pre.val == node.val){
                count++;
            }
            if (nowMax == count){
                list.add(node);
            }
            else if (nowMax<count){
                nowMax = count;
                list.clear();
                list.add(node);
                count = 1;
            }
        }
        if (pre == null){
            list.add(node);
        }
        pre = node;
        if (node.right!=null){
            helper(node.right);
        }
    }
}
