public class Merge {

    class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    /*  剑指offer--合并两个排序的链表
    *   Q: 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
    *   A: 两个链表比较大小并将结点添加到新链表中，直到有一个链表为null，将另一个链表直接添加到新链表中
    * */

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode first = new ListNode(0);
        ListNode temp = first;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null){
            temp.next = list2;
        }
        return first.next;
    }
}
