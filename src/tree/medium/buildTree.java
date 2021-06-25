package tree.medium;

import java.util.HashMap;
import java.util.Map;

// 前序中序还原二叉树
public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> duiyingMap = new HashMap<>();
        for (int i = 0;i<inorder.length;i++){
            duiyingMap.put(inorder[i],i);
        }
        if(preorder == null||preorder.length==0){
            return null;
        }
        TreeNode head = new TreeNode();
        TreeNode pre = head;

        for (int i = 0;i<preorder.length;i++){
            if (i==0){
                head = new TreeNode(preorder[i]);
                pre = head;
                continue;
            }
            if(duiyingMap.get(pre.val)>preorder[i]){
                pre.right = new TreeNode(preorder[i]);
                pre = pre.right;
            }else{
                pre.left = new TreeNode(preorder[i]);
                pre = pre.left;
            }
        }
        return head;
    }
}
