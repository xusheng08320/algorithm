package com.xusheng.link;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode second = dummyHead;
        ListNode first = dummyHead;
        for (int i = 0; i <= n; i++) {
            second = second.next;
        }
        while (second != null) {
            second = second.next;
            first = first.next;
        }
        first.next = first.next.next;
        return dummyHead.next;
    }
}
