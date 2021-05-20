package tree.easy;

/**
 * 极其简单，直接换就好了
 */
public class InvertTree {
    TreeNode temp;
    public void invert(TreeNode root){
        if(root == null) return;
        temp = root.right;
        root.right = root.left;
        root.left = temp;
        invert(root.left);
        invert(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}
