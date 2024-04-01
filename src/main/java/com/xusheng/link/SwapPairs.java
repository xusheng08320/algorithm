package com.xusheng.link;

import org.junit.Test;

public class SwapPairs {

    @Test
    public void test() {

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode curNode = virtualHead;
        while (curNode.next != null && curNode.next.next != null) {
            ListNode node1 = curNode.next;
            ListNode node2 = curNode.next.next;
            node1.next = node2.next;
            node2.next = node1;
            curNode.next = node2;
            curNode = node1;
        }
        return virtualHead.next;
    }
}
