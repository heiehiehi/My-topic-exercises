package 代码随想录;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class 二叉搜索数的最小绝对差 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(4);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(1);
        TreeNode D = new TreeNode(3);
        TreeNode E = new TreeNode(6);
        A.left = B;
        A.right = E;
        B.left = C;
        B.right = D;
        System.out.println(getMinimumDifference(A));
    }
    static int minabs = Integer.MAX_VALUE;
    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        list.sort((a,b)->(b-a));
        for (int i = 0;i<list.size()-1;i++){
            if (minabs>Math.abs(list.get(i)-list.get(i+1))){
                minabs = Math.abs(list.get(i)-list.get(i+1));
            }
        }
        return minabs;
    }
    public static void helper(TreeNode root,List<Integer> priorityQueue){
        priorityQueue.add(root.val);
        if (root.left!=null)helper(root.left,priorityQueue);
        if (root.right!=null)helper(root.right,priorityQueue);
    }
}
