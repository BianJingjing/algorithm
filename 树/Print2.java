import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Print2 {

    /*  剑指offer--按之字形顺序打印二叉树
    *   Q: 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
    *   A: 利用java中linkedList的底层是双向链表的特点进行实现
    *       1、使用队列，实现树的层次遍历
    *       2、双向遍历，奇数层从前向后遍历，偶数层从后向前遍历，需要设置一个flag和一个分隔符
    * */

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<ArrayList<Integer>> Print2(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        //null作为分隔符
        queue.addLast(null);
        queue.addLast(root);
        boolean leftToRight = true;
        while (queue.size() != 1){
            TreeNode treeNode = queue.poll();
            if (treeNode == null){
                //根据方向flag设置迭代器方向
                Iterator<TreeNode> iterator = null;
                if (leftToRight){
                    iterator = queue.iterator();
                }else {
                    iterator = queue.descendingIterator(); //从后往前遍历
                }
                leftToRight = !leftToRight;
                //将该层节点添加到list中
                while (iterator.hasNext()){
                    TreeNode node = iterator.next();
                    list.add(node.val);
                }

                res.add(new ArrayList<Integer>(list));
                list.clear();
                queue.addLast(null); //添加分隔符
                continue;
            }
            if (treeNode.left != null){
                queue.add(treeNode.left);
            }
            if (treeNode.right != null){
                queue.add(treeNode.right);
            }
        }
        return res;
    }
}
