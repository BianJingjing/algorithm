public class clone_offer25 {

    /*  剑指offer--复杂链表的复制
    *   Q: 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，
    *      并返回拷贝后的头结点。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
    *   A: 通过复制链表结点，再拆分获得一个新的链表，分三步走：
    *       1、复制链表的每个结点，复制的结点链接在原结点之后
    *       2、复制结点的random指针也进行复制
    *       3、拆分新旧链表
    * */


    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
//    public RandomListNode Clone(RandomListNode pHead){
//        if (pHead == null){
//            return null;
//        }
//
//        RandomListNode currentNode = pHead;
//        while (currentNode != null){
//            RandomListNode cloneNode = new RandomListNode(currentNode.label);
//            RandomListNode nextNode = currentNode.next;
//            currentNode.next = cloneNode;
//            cloneNode.next = nextNode;
//            currentNode = nextNode;
//        }
//
//        currentNode = pHead;
//        while (currentNode != null){
//            currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
//            currentNode = currentNode.next.next;
//        }
//
//        currentNode = pHead;
//        RandomListNode pCloneHead = pHead.next;
//        while (currentNode != null){
//            RandomListNode cloneNode = currentNode.next;
//            currentNode.next = cloneNode.next;
//            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
//            currentNode = currentNode.next;
//        }
//        return pCloneHead;
//    }

    public RandomListNode Clone(RandomListNode pHead){
        if (pHead == null){
            return null;
        }

        RandomListNode currentNode = pHead;
        while(currentNode != null){
            RandomListNode copyNode = new RandomListNode(currentNode.label);
            RandomListNode next = currentNode.next;
            currentNode.next = copyNode;
            copyNode.next = next;
            currentNode = next;
        }

        currentNode = pHead;
        while (currentNode != null){
            currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        currentNode = pHead;
        RandomListNode pCopyHead = pHead.next;
        while (currentNode != null){
            RandomListNode copyNode = currentNode.next;
            currentNode.next = currentNode.next.next;
            copyNode.next = copyNode.next == null ? null : copyNode.next.next;
            currentNode = currentNode.next;
        }
        return pCopyHead;
    }
}
