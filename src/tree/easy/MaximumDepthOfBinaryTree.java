package tree.easy;


/**
 * 简单的递归就好
 */
public class MaximumDepthOfBinaryTree {
    int max = 0;


    public void count(TreeNode node,int num ){
        if (node == null) return ;
        num += 1;
        max = max < num ?num:max;
        if(node.left != null){
            count(node.left,num);
        }
        if(node.right != null){
            count(node.right,num);
        }
    }
    public int maxDepth(TreeNode root) {
        count(root,0);
        return max;
    }
}
