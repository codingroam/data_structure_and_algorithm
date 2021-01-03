package com.company.algorithm.sort.insertion;

import com.company.algorithm.sort.Sort;

public class InsertionSort extends Sort {
    @Override
    protected void sort() {
        for(int begin=1;begin<array.length;begin++){
            int cur = begin;
            while(cur>0&&compare(array[cur],array[cur-1])<0){
                swap(cur,cur-1);
                cur--;
            }
        }
    }
}
