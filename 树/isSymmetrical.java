public class isSymmetrical {

    /*  剑指offer--对称的二叉树
    *   Q: 请实现一个函数，用来判断一棵二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
    *   A: 递归实现
    *       1、根节点返回true
    *       2、判断左右结点是否对称
    * */

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isSymmetrical(TreeNode root){
        if (root == null) return true;
        return isSymmetrical(root.left,root.right);
    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        //只有两个结点同时为null 才能返回true，任意一方为null时，返回false
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val && isSymmetrical(left.left,right.right) && isSymmetrical(left.right,right.left);
    }
}
