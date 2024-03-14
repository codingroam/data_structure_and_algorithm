package com.company.algorithm.leetcode.linkedlist.a_remove_node;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //虚拟节点
         ListNode dummyHead = new ListNode();
         dummyHead.next = head;
         ListNode curr = dummyHead;
         while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }

         }


         return dummyHead.next;

    }
}