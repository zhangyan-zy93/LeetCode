package tree.easy;

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


public class increasingBST {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode node = root;
        TreeNode l = root.left;
        if(l!=null){
            increasingBST(l);
        }

        TreeNode r = root.right;
        return node;
    }
}
