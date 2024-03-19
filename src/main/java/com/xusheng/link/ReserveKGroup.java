package com.xusheng.link;

// TODO
public class ReserveKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode firstNode = new ListNode(0);
        firstNode.next = head;
        ListNode lastNode = firstNode;
        while (head != null) {
            ListNode curEndNode = getEndNode(head, k);
            reserve(head, curEndNode);
        }
        return null;
    }

    private void reserve(ListNode head, ListNode end) {

    }

    private ListNode getEndNode(ListNode firstNode, int k) {
        ListNode result = firstNode;
        for (int i = 0; i < k - 1; i++) {
            if (result.next == null) {
                return result;
            }
            result = result.next;
        }
        return result;
    }


}