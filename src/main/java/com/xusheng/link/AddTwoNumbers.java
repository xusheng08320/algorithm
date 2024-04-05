package com.xusheng.link;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
        int prev = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int val = (n1 + n2 + prev) % 10;
            prev = (n1 + n2 + prev) / 10;
            ListNode node = new ListNode(val);
            result.next = node;
            result = result.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (prev > 0) {
            result.next = new ListNode(prev);
        }
        return head.next;
    }
}
