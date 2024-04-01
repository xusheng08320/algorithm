package com.xusheng.link;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode firstNode = head;
        for (int i = 0; i < n; i++) {
            firstNode = firstNode.next;
        }
        ListNode secondNode = virtualHead;
        while (firstNode != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = secondNode.next.next;
        return virtualHead.next;
    }
}
