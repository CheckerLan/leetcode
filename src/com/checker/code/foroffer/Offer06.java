package com.checker.code.foroffer;

import com.checker.structure.ListNode;

import java.util.Stack;

public class Offer06 {
    public int[] reversePrint(ListNode head) {
        // 无stack
        // if(head == null){
        //     return new int[]{};
        // }else if (head.next == null){
        //     return new int[]{head.val};
        // }

        // ListNode node = head.next;
        // ListNode pre = head;
        // int count = 1;
        // while(node != null){
        //     ListNode next = node.next;
        //     node.next = pre;
        //     pre = node;
        //     node = next;
        //     count++;
        // }
        // int[] res = new int[count];
        // while(count > 0){
        //     count--;
        //     res[res.length - count - 1] = pre.val;
        //     pre = pre.next;
        // }
        // return res;
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        int size = 0;
        while(node != null){
            stack.push(node);
            size++;
            node = node.next;
        }
        int[] res = new int[size];
        for(int i = 0; i < size; i++){
            res[i] = stack.pop().val;
        }
        return res;

    }
}
