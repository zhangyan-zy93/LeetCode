package tree.easy;

/**
 * 直接暴力反转，但似乎有更好的办法，todo 去看看别人好的解法
 */
public class MergeTrees {

    public TreeNode merge(TreeNode node1,TreeNode node2){
        if (node1 == null && node2 == null) return null;
        TreeNode node = new TreeNode();
        if(node1 != null && node2 != null){
            node.val = node1.val + node2.val;
            node.left = merge(node1.left,node2.left);
            node.right = merge(node1.right,node2.right);
        }else if(node1 != null){
            node = node1;
        }else node = node2;

        return node;
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1,root2);
    }
}
