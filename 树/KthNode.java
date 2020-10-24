public class KthNode {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /*  剑指offer--二叉搜索树的第k个结点
    *   Q: 给定一棵二叉搜索树，请找出其中的第k小的结点。例如，（5，3，7，2，4，6，8）  中，按结点数值大小顺序第三小结点的值为4。
    *   A: 第三小结点 对应 中序遍历的第3个结点
    *       使用递归进行中序遍历
    * */
    int count = 0;
    TreeNode KthNode(TreeNode root, int k){
        if (root != null){
            TreeNode node = KthNode(root.left, k);
            //找到结点，递归终止
            if (node != null){
                return node;
            }
            count++;
            if (count == k){
                return root;
            }
            node = KthNode(root.right,k);
            if (node != null){
                return node;
            }
        }
        return null;
    }
}
