package com.checker.code.foroffer;

import com.checker.structure.ListNode;

import java.util.LinkedList;
import java.util.List;

public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode listNode = head;
        LinkedList<ListNode> list = new LinkedList<>();
        while (listNode != null) {
            list.add(listNode);
            if (list.size() >= k + 1 && list.size() > 0) {
                list.removeFirst();
            }
            listNode = listNode.next;
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        Offer22 offer22 = new Offer22();
    }
}
