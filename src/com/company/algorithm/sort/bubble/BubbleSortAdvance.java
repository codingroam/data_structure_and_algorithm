package com.company.algorithm.sort.bubble;


import com.company.algorithm.sort.Sort;

/*
 * 优化：sortedIndex字段来记录最后一次交换的位置
 * */
public class BubbleSortAdvance extends Sort {


    @Override
    protected void sort() {
        for(int end = array.length-1;end>0;end--){
            //sortedIndex = 1是为数组完全有序这种情况做准备，数组完全有序则不会进入if条件,end被赋值为1后退出排序。
            int sortedIndex = 1;
            for(int start = 1;start<=end;start++){
                if(compare(array[start],array[start-1])<0){
                    swap(start,start-1);
                    sortedIndex = start;
                }
            }
            end = sortedIndex;
        }
    }
}
