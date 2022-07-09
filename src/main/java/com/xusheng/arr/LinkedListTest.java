package com.xusheng.arr;

import org.junit.Test;
import org.w3c.dom.ls.LSException;

public class LinkedListTest {

    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode lastNode = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = lastNode;
            lastNode = head;
            head = nextNode;
        }
        return lastNode;
    }

    @Test
    public void testReverseKGroup() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode headNode = reverseKGroup(node1, 2);
        while (headNode != null) {
            System.out.println(headNode.val);
            headNode = headNode.next;
        }
    }

    /**
     * k个一组翻转链表
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode firstNode = new ListNode(0, head);
        ListNode last = firstNode;
        while (head != null) {
            ListNode endNode = getEndNode(head, k);
            if (endNode == null) {
                return firstNode.next;
            }
            ListNode nextGroupFirstNode = endNode.next;
            reverseList(head, endNode);
            last.next = endNode;
            head.next = nextGroupFirstNode;
            last = head;
            head = nextGroupFirstNode;
        }
        return firstNode.next;
    }

    public ListNode getEndNode(ListNode head, int k) {
        if (k <= 0) {
            return head;
        }
        for (int i = 0; i < k - 1; i++) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
        }
        return head;
    }

    public void reverseList(ListNode head, ListNode end) {
        if (head == end) {
            return;
        }
        ListNode lastNode = null;
        while (head != end) {
            ListNode nextNode = head.next;
            head.next = lastNode;
            lastNode = head;
            head = nextNode;
        }
        end.next = lastNode;
    }


        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }

            @Override
            public String toString() {
                return String.valueOf(val);
            }
        }
}
