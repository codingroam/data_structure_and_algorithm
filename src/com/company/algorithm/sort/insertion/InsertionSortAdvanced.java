package com.company.algorithm.sort.insertion;

import com.company.algorithm.sort.Sort;

/**
 * 思路：由交换改为挪动
 */

public class InsertionSortAdvanced extends Sort {
    @Override
    protected void sort() {
        for(int begin = 1;begin<array.length;begin++){
            int cur = begin;
            int element = array[cur];
            while(cur>0&&compare(element,array[cur-1])<0){
                array[cur] = array[cur-1];
                swapCount++;
                cur--;
            }
            array[cur] = element;
        }
    }
}
