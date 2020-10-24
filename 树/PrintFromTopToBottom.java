import java.util.*;

public class PrintFromTopToBottom {

    /*  剑指offer--从上往下打印二叉树
    *   Q: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
    *   A: 二叉树层次遍历，利用queue的先进先出特性
    *       1、将层次遍历的结果添加到queue中
    *       2、queue先进先出，将结点的值添加到ArrayList中
    * */

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if (treeNode.left != null){
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null){
                queue.offer(treeNode.right);
            }
            res.add(treeNode.val);
        }
        return res;
    }
}
