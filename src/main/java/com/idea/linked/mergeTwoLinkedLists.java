package com.idea.linked;

/**
 * 合并两个有序链表
 * @author 赵继
 * 2019/11/7.
 */
public class mergeTwoLinkedLists {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode phead = new ListNode(-1);
        ListNode prev = phead;
        while (l1!=null && l2!=null) {
            if (l1.val > l2.val) {
                prev.next = l2;
                l2 = l2.next;
            } else {
                prev.next = l1;
                l1 = l1.next;
            }
            prev = prev.next;
        }

        prev.next = (l1==null) ? l2 : l1;

        return phead.next;
    }

}
