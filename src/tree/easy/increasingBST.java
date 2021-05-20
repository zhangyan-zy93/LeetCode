package tree.easy;




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
