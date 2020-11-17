public class Convert_offer26 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    TreeNode tail = null;
    TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return head;
    }

    private void ConvertSub(TreeNode pRootOfTree) {
        if (pRootOfTree == null){
            return;
        }
        ConvertSub(pRootOfTree.left);
        if (tail == null){
            tail = pRootOfTree;
            head = pRootOfTree;
        }else {
            tail.right = pRootOfTree;
            pRootOfTree.left = tail;
            tail = pRootOfTree;
        }
        ConvertSub(pRootOfTree.right);
    }
}
