package com.company.algorithm.leetcode.cycle_linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description TODO
 * @Author wangkai
 * @Date 2024/3/4 13:36
 */
public class HashSetSolution {


    public ListNode solution(ListNode head){

        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (!set.add(curr)) return curr;
            curr = curr.next;
        }
        return null;

    }

}
