package com.company.algorithm.sort.bubble;

import com.company.algorithm.sort.Sort;


/*
* 优化：sort字段来判断数组是否已经完全有序
* */
public class BubbleSort extends Sort {

    @Override
    protected void sort() {
        for(int end = array.length-1;end>0;end--){
            Boolean sorted = true;
            for(int start = 1;start<=end;start++){
                if(compare(array[start],array[start-1])<0){
                    swap(start,start-1);
                    sorted = false;//进入该if条件证明数组未排好序

                }
            }
            if(sorted) break;//判断数组是否有序，有序则跳出
        }
    }
}
