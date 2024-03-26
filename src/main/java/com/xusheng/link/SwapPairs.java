package com.xusheng.link;

import org.junit.Test;

public class SwapPairs {

    @Test
    public void test() {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode firstNode = new ListNode();
        firstNode.next = head;
        ListNode cur = firstNode;
        while (cur.next != null && cur.next.next != null) {
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;
            node1.next = node2.next;
            node2.next = node1;
            cur.next = node2;
            cur = node1;
        }
        return firstNode.next;
    }
}
