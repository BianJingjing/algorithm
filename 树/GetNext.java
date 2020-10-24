public class GetNext {

    /*  剑指offer--二叉树的下一个结点
    *   Q: 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
    *   A: 中序：左根右  next指向父节点  分情况讨论
    *       1、二叉树为空
    *       2、当前结点存在右子树，下一个结点即右子树最左边的点
    *       3、当前结点没有右子树 a：该结点是父节点的左孩子 下一个结点是父节点
    *                         b：该结点是父节点的右孩子，找父节点的父节点的。。。， 下一个结点的左孩子是其父节点
    * */

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode == null)return null;
        if (pNode.right != null){
            pNode = pNode.right;
            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }
        while (pNode.next != null){
            if (pNode.next.left == pNode) return pNode.next;
            pNode = pNode.next;
        }
        return null;
    }
}
