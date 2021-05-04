package tree.easy;


/**
 * 本题次思路由递归实现，一遍过，100%，我真棒
 */

public class SymmetricTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean dfs(TreeNode leftRoot,TreeNode rightRoot){
        if(leftRoot == null||rightRoot == null){
            return leftRoot == null&&rightRoot == null;
        }
        if (leftRoot.val != rightRoot.val){
            return false;
        }
        boolean outFlag = dfs(leftRoot.left,rightRoot.right);
        boolean innerFlag = dfs(leftRoot.right,rightRoot.left);
        return outFlag&&innerFlag;
    }


    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root;
        TreeNode right = root;
        return dfs(left,right);
    }
}
