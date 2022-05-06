package 代码随想录;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 从中序与后序遍历序列构造二叉树 {
    public static void main(String[] args) {
        int inorder[] = {8};
        int postorder[] = {8};
        buildTree(inorder,postorder);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,postorder);
    }
    public static TreeNode helper(int[] inorder, int[] postorder) {
        if (postorder == null){
            return null;
        }
        int val = postorder[postorder.length-1];
        TreeNode node = new TreeNode(val);
        int delimiterIndex = 0;
        for (int i = 0;i<inorder.length;i++){
            if (inorder[i]==val){
                delimiterIndex = i;
                break;
            }
        }
        int len = inorder.length;

        int leftinorder[];
        int leftpostorder[];
        int rightinorder[];
        int rightpostorder[];

        if (delimiterIndex == 0){
            leftinorder = null;
            leftpostorder = null;
        }
        else {
            leftinorder = new int[delimiterIndex-0];
            leftpostorder = new int[delimiterIndex-0];
            for (int i = 0;i<delimiterIndex;i++){
                leftinorder[i] = inorder[i];
            }
        }
        if (delimiterIndex == inorder.length-1){
            rightinorder = null;
            rightpostorder = null;
        }
        else {
            rightinorder = new int[len-delimiterIndex-1];
            rightpostorder = new int[len-delimiterIndex-1];
            for (int i = delimiterIndex+1,j = 0;i<len;i++,j++){
                rightinorder[j] = inorder[i];
            }
        }

        for (int i = 0,j = 0;i<postorder.length-1;i++,j++){
            if (i<delimiterIndex){
                leftpostorder[j] = postorder[i];
            }
            else{
                if (i==delimiterIndex){
                    j=0;
                }
                rightpostorder[j] = postorder[i];
            }
        }
        node.left = helper(leftinorder,leftpostorder);
        node.right = helper(rightinorder,rightpostorder);
        return node;
    }
}
