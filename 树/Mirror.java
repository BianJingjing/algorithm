public class Mirror {

    /*  剑指offer--镜像二叉树
    *   Q: 操作给定的二叉树，将其变换为源二叉树的镜像。
    *   A: 先序遍历
    *       1、若左右结点存在，交换左右结点，递归左右结点
    *       2、递归终止，左右结点null
    * */

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null){
            Mirror(root.left);
        }
        if (root.right != null){
            Mirror(root.right);
        }
    }
}
