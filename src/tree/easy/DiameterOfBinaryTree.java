package tree.easy;

/**
 * 递归轻松解出，一遍过，时间空间双完美，我真厉害
 */
public class DiameterOfBinaryTree {

    int max = 0;
    public int count(TreeNode root){
        if(root == null){
            return -1;
        }
        int leftCount = count(root.left) + 1;
        int rightCount = count(root.right) + 1;
        int maxOneEdge = leftCount > rightCount ? leftCount : rightCount;
        int containsSelf = leftCount + rightCount;
        max = max > containsSelf ? max : containsSelf;
        return maxOneEdge;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        count(root);
        return max;
    }
}
