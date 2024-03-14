package com.company.algorithm.leetcode.linkedlist.a_remove_node;

/**
 * @Description TODO
 * @Author wangkai
 * @Date 2024/3/14 15:37
 */
public class MainTest {


    public static void main(String[] args) {
        ListNode headNode = new ListNode(3);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        headNode.next = node1;
        headNode.next.next = node2;
        headNode.next.next.next = node3;

        Solution solution = new Solution();
        solution.removeElements(headNode,4);


    }
}
