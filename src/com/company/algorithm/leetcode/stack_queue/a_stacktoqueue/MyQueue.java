package com.company.algorithm.leetcode.stack_queue.a_stacktoqueue;

import java.util.Stack;

class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    /** Initialize your data structure here. */
    public MyQueue() {
        stackIn = new Stack<>(); // 负责进栈
        stackOut = new Stack<>(); // 负责出栈
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {    
        dumpstackIn();
        return stackOut.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    // 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
    private void dumpstackIn(){
        if (!stackOut.isEmpty()) return; 
        while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
        }
    }


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(8);
        myQueue.push(9);
        myQueue.push(10);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        myQueue.push(11);
        myQueue.push(12);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

    }
}
