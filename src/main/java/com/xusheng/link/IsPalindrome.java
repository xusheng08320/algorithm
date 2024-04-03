package com.xusheng.link;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int front = 0;
        int back = list.size() - 1;
        while (front < back) {
            if (list.get(front++) != list.get(back--)) {
                return false;
            }
        }
        return true;
    }
}
