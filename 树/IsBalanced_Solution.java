

public class IsBalanced_Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /*  剑指offer--平衡二叉树
    *   Q: 输入一棵二叉树，判断该二叉树是否是平衡二叉树。在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
    *   A: 借助一个获取树的深度差的递归函数，如果不是平衡二叉树，则递归终止，如果是则返回树深度
    * */

    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = getDepth(root.left);
        if (left == -1) return -1;
        int right = getDepth(root.right);
        if (right == -1) return  -1;
        return Math.abs(left - right) > 1 ? -1 : 1+ Math.max(left, right);
    }

}
