package tree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * todo 解答区有更快的递归方式，有空了试试去
 */
public class levelOrder {
    /**
     * 此法不好，若是树很稀疏，又很深，会浪费大量的时间，空间，反倒不如直接使用两个队列的好
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder1(TreeNode root) {
        if (root== null) return null;
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> temp = new ArrayList<>();
        int count = 1,level = 2;
        while (!q.isEmpty()){
            TreeNode node = q.poll();
            if(node!=null){
                temp.add(node.val);
                q.offer(node.left);
                q.offer(node.right);
            }else {
                q.offer(null);
                q.offer(null);
            }
            count+=2;
            if (count == Math.pow(2,level)-1){
                level+=1;
                result.add(temp);
                temp = new ArrayList<>();
            }

        }
        return result;
    }

    /**
     * 双队列方法
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root== null) return result;
        Queue<TreeNode> qin = new LinkedList<>();
        Queue<TreeNode> qout = new LinkedList<>();
        qout.offer(root);
        List<Integer> temp = new ArrayList<>();
        boolean flag = true;
        while (!qin.isEmpty() || !qout.isEmpty()){
            if(qout.isEmpty()){
                qout = qin;
                qin = new LinkedList<>();
                result.add(temp);
                temp = new ArrayList<>();
            }
            TreeNode node = qout.poll();
            if (node != null){
                qin.offer(node.left);
                qin.offer(node.right);
                temp.add(node.val);
            }

        }
        return result;
    }




}
