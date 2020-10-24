import java.util.Arrays;

public class reConstructBinaryTree {
    /*  剑指offer--重建二叉树
    *   Q: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    *   例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    *   A: 数的结构适合用递归实现
    *       1、树的最后一步，假设左右子树已经建好，只需添加左右子树即可
    *       2、如果序列长度为一，即树的叶子结点，递归终止
    *       3、确定左右子树的位置
    * */

    //Definition for binary tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0) return null;
        //前序遍历的第一个元素即为根节点
        int rootVal = pre[0];
        TreeNode root = new TreeNode(rootVal);
        if (pre.length == 1) return root;
        //遍历寻找根节点在中序遍历中的位置
        int rootIndex = 0;
        for (int i = 0; i < in.length; i++){
            if (rootVal == in[i]){
                rootIndex = i;
                break;
            }
        }
        //递归安插左右子树
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,1+rootIndex),Arrays.copyOfRange(in,0,rootIndex));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,in.length));
        return root;
    }
}
