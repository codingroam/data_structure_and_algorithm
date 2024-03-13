package com.company.algorithm.leetcode.reverseLinkedList;

/**
 * 头插法
 */
class Solution1 {
    public ListNode reverseList(ListNode head) {

        //新建头节点
        ListNode newHead = new ListNode(0);
        

        while(head != null){
            //将head下个节点保存到temp
            ListNode temp = head.next;

            //将新建头节点的next值赋值给head.next
            head.next = newHead.next;

            //新建头节点指向head,完成头部插入
            newHead.next = head;

            //head向后移动
            head = temp;


        }
        return newHead.next;

    }
}