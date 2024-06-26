package com.xusheng.link;

import org.junit.Test;

public class ReserveKGroup {

    @Test
    public void testReserseKGroup() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode listNode = reverseKGroup(node1, 2);
        System.out.println(listNode);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode virtualHead = new ListNode();
        virtualHead.next = head;
        ListNode prev = virtualHead;
        while (head != null) {
            ListNode end = getEndNode(head, k);
            if (end == null) {
                return virtualHead.next;
            }
            ListNode nextGroupFirstNode = end.next;
            reserveNode(head, end);
            head.next = nextGroupFirstNode;
            prev.next = end;
            prev = head;
            head = nextGroupFirstNode;
        }
        return virtualHead.next;
    }

    private void reserveNode(ListNode head, ListNode end) {
        ListNode prev = null;
        while (head != end) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head.next = prev;
    }

    private ListNode getEndNode(ListNode head, int k) {
        for (int i = 0; i < k - 1; i++) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
        }
        return head;
    }


}