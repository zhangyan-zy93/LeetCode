package tree.medium;


/**
 * 树转链表，顺序为先序遍历顺序
 * 虽通过，却不为最优解
 * todo 看看最优解去，就一种更优的
 * */
public class Flatten {


    public TreeNode deal(TreeNode pre,TreeNode node){
        if (node==null){
            return pre;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        if(pre != null){
            pre.right = node;
            pre.left = null;
        }
        node = deal(node,left);
        node = deal(node,right);
        return node;
    }

    public void flatten(TreeNode root) {
        deal(null,root);
    }
}
