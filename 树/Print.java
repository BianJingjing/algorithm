import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {

    /*  剑指offer--把二叉树打印成多行
    *   Q: 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
    *   A: 设置分层标志start end
    * */

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root == null){
            return result;
        }
        int start = 0, end = 1;
        ArrayList<Integer> layerList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            layerList.add(treeNode.val);
            start++;
            if (treeNode.left != null){
                queue.offer(treeNode.left);

            }
            if (treeNode.right != null){
                queue.offer(treeNode.right);
            }
            if (start == end){
                start = 0;
                end = queue.size();
                result.add(layerList);
                layerList = new ArrayList<Integer>();
            }
        }
        return result;
    }
}
