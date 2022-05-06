package 代码随想录;

public class 删除二叉搜索树中的节点 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(3);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(5);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(10);
        TreeNode F = new TreeNode(8);
        TreeNode G = new TreeNode(15);
        TreeNode H = new TreeNode(7);
        A.left = B;
        A.right = C;
        C.left =D;
        C.right = E;
        E.left = F;
        F.left =H;
        E.right = G;

        deleteNode(A,5);
    }
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return root;
        }
        TreeNode rootfather = new TreeNode(Integer.MAX_VALUE);
        rootfather.left = root;
        helper(null,rootfather,key,true);
        return rootfather.left;
    }
    public static void helper(TreeNode father,TreeNode root,int key,boolean left){
        if (root == null){
            return;
        }
        if (root.val > key){
            helper(root,root.left,key,true);
        }
        else if (root.val < key){
            helper(root,root.right,key,false);
        }
        else{
            if (root.right==null&&root.left==null){
                if (left){
                    father.left = null;
                }
                else {
                    father.right = null;
                }
            }
            else if (root.left==null&&root.right!=null){
                if (left){
                    father.left = root.right;
                }
                else {
                    father.right = root.right;
                }
            }
            else if (root.left!=null&&root.right==null){
                if (left){
                    father.left = root.left;
                }
                else {
                    father.right = root.left;
                }
            }
            else {
                TreeNode leftnode = root.left;
                if (left){
                    father.left = root.right;
                }
                else {
                    father.right = root.right;
                }
                root = root.right;
                TreeNode cur = root;
                if (cur.left!=null){
                    cur = cur.left;
                }
                cur.left = leftnode;
            }
        }
    }
}
