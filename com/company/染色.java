package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 染色 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(4);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(7);
        TreeNode D = new TreeNode(1);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
//        A.left = B;
//        B.left = D;
//        A.right = C;
//        C.left = E;
//        E.right = F;
        int ops[][] = {{1,5,8}};
        System.out.println(getNumber(A,ops));
    }
    static List<Integer> arr = new ArrayList<>();
    public static int getNumber(TreeNode root, int[][] ops) {
        if (root == null){
            return 0;
        }
        bianli(root);
        Collections.sort(arr);
        int arr2[] = new int[arr.get(arr.size()-1)+1];

        for (Integer i:arr) {
            arr2[i] = 1;//1表示蓝色 2表示红色；
        }
        for (int i = 0;i<ops.length;i++){
            for (int j = ops[i][1];j<=arr.get(arr.size()-1)&&j<=ops[i][2];j++){
                int type = ops[i][0]+1;
                if (arr2[j] == type){
                    continue;
                }
                else if (arr2[j]== 0){
                    continue;
                }
                else {
                    arr2[j] = type;
                }

            }
        }
        int count = 0;
        for (Integer i:arr2){
            if (i==2){
                count++;
            }
        }
        return count;
    }
    public static void bianli(TreeNode node){
        if (node==null){
            return;
        }
        arr.add(node.val);
        bianli(node.left);
        bianli(node.right);
    }
}
