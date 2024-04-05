package com.xusheng.doublPointer;

import com.xusheng.link.ListNode;

public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                while (slow != head) {
                    slow = slow.next;
                    head = head.next;
                }
                return head;
            }
        }
        return null;
    }
}
