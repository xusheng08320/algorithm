package com.xusheng.link;

public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
                head = head.next;
                continue;
            }
            prev = head;
            head = head.next;
        }
        return dummyHead.next;
    }
}
