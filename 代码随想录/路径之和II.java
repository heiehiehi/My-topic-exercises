package 代码随想录;

import java.util.ArrayList;
import java.util.List;

public class 路径之和II {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(5);
        TreeNode A1 = new TreeNode(4);
        TreeNode A2 = new TreeNode(8);
        TreeNode A3 = new TreeNode(11);
        TreeNode A4 = new TreeNode(13);
        TreeNode A5 = new TreeNode(4);
        TreeNode A6 = new TreeNode(7);
        TreeNode A7 = new TreeNode(2);
        TreeNode A8 = new TreeNode(5);
        TreeNode A9 = new TreeNode(1);
        A.left = A1;
        A.right = A2;
        A1.left = A3;
        A3.left = A6;
        A3.right = A7;
        A2.left = A4;
        A2.right = A5;
        A4.left = A8;
        A4.right = A9;
        List<List<Integer>> ans = pathSum(A,22);
        for (List<Integer> i:ans){
            System.out.println(i.toString());
        }
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(ans,res,root,0,targetSum);
        return ans;
    }
    public static void helper(List<List<Integer>> ans,List<Integer> res,TreeNode node,int sum,int targetSum){
        sum += node.val;
        if (sum>targetSum){
            return;
        }
        res.add(node.val);
        if ((node.left==null&&node.right==null)&&sum == targetSum){
            ans.add(new ArrayList<>(res));
        }
        else {
            if (node.left!=null){
                helper(ans,res,node.left,sum,targetSum);
            }
            if (node.right!=null){
                helper(ans,res,node.right,sum,targetSum);
            }
        }
        res.remove(res.size()-1);
    }
}
