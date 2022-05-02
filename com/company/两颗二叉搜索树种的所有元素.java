package com.company;

import java.util.ArrayList;
import java.util.List;

public class 两颗二叉搜索树种的所有元素 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(2);
        TreeNode B = new TreeNode(1);
        TreeNode C = new TreeNode(4);
        TreeNode D = new TreeNode(0);
        TreeNode E = new TreeNode(1);
        TreeNode F = new TreeNode(3);
        A.left = B;
        A.right = C;
        E.left = D;
        E.right = F;
        System.out.println(getAllElements(A,E).toString());
    }
    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        helper(ans1,root1);
        helper(ans2,root2);
        System.out.println(ans1.toString());
        System.out.println(ans2.toString());
        List<Integer> ans = new ArrayList<>();
        int ans1sp = 0;
        int ans2sp = 0;
        while (ans1sp<ans1.size()&&ans2sp<ans2.size()){
            if (ans1.get(ans1sp)<ans2.get(ans2sp)){
                ans.add(ans1.get(ans1sp));
                ans1sp++;
            }
            else {
                ans.add(ans2.get(ans2sp));
                ans2sp++;
            }
        }
        if (ans1sp==ans1.size()){
            while (ans2sp<ans2.size()){
                ans.add(ans2.get(ans2sp));
                ans2sp++;
            }
        }
        else {
            while (ans1sp<ans1.size()){
                ans.add(ans1.get(ans1sp));
                ans1sp++;
            }
        }
        return ans;

    }
    public static void helper(List<Integer> ans,TreeNode node){
        if (node!=null){
            helper(ans,node.left);
            ans.add(node.val);
            helper(ans,node.right);
        }
    }
}
