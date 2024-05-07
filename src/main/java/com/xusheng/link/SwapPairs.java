package com.xusheng.link;

import org.junit.Test;

public class SwapPairs {

    @Test
    public void test() {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;
            ListNode nextHead = second.next;
            prev.next = second;
            second.next = first;
            first.next = nextHead;
            prev = first;
            head = nextHead;
        }
        return dummyHead.next;
    }
}
