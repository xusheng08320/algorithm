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
        ListNode firstNode = new ListNode();
        firstNode.next = head;
        ListNode last = firstNode;
        while (head != null) {
            ListNode endNode = getEndNode(head, k);
            if (endNode == null) {
                return firstNode.next;
            }
            ListNode nextGroupFirstNode = endNode.next;
            reserveList(last, endNode);
            last.next = endNode;
            head.next = nextGroupFirstNode;
            last = head;
            head = nextGroupFirstNode;

        }
        return firstNode.next;
    }

    private ListNode getEndNode(ListNode curNode, int k) {
        ListNode indexNode = curNode;
        for (int i = 0; i < k - 1; i++) {
            if (indexNode.next == null) {
                return null;
            }
            indexNode = indexNode.next;
        }
        return indexNode;
    }

    private void reserveList(ListNode firstNode, ListNode endNode) {
        if (firstNode == endNode) {
            return;
        }
        ListNode prev = null;
        while (firstNode != endNode) {
            ListNode next = firstNode.next;
            firstNode.next = prev;
            prev = firstNode;
            firstNode = next;
        }
        endNode.next = prev;
    }


}