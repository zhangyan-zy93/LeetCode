package tree.medium;

import java.util.ArrayList;
import java.util.List;


/**
 * 超简单的中序遍历，原来中序是指节点在中间呀，之前想错了
 * 中序遍历顺序： 左，中，右
 * 因本结点在中间遍历，故称中序遍历
 */
public class InorderTraversal {


    public void recursion(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        recursion(root.left,list);
        list.add(root.val);
        recursion(root.right,list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursion(root,list);
        return list;
    }
}
