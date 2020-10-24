public class HasSubtree {

    /*  剑指offer--树的子结构
    *   Q: 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
    *   A: 比较两个树的根节点是否相同？进行左右子树的比较(递归）: 再对A树的结点进行递归，知道找到与B树根节点相同的结点
    * */

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) { this.val = val;
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean flag = false;
        if (root1 != null && root2 != null){
            if (root1.val == root2.val){
                flag = doesTree1HavaTree2(root1,root2);
            }
            if (!flag){
                flag = HasSubtree(root1.left,root2);
            }
            if (!flag){
                flag = HasSubtree(root1.right,root2);
            }
        }
        return flag;
    }

    private boolean doesTree1HavaTree2(TreeNode node1, TreeNode node2) {
        //必须要先判断node2，如果到了叶子结点，node1和node2都是null，应返回true。若node1在前则返回false了
        if (node2 == null){
            return true;
        }
        if (node1 == null){
            return false;
        }
        if (node1.val != node2.val){
            return false;
        }
        return doesTree1HavaTree2(node1.left,node2.left) && doesTree1HavaTree2(node1.right,node2.right);
    }
}
