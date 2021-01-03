package com.company.algorithm.sort.selection;


import com.company.algorithm.sort.Sort;

/**
 * dsfds
 * dfdsf
 * dsfdf
 * dsfd
 *
 */
public class SelectionSort extends Sort {

    @Override
    protected void sort() {
        for(int end = array.length-1;end>0;end--){
            int maxIndex = 0;
            for(int start=0;start<=end;start++){
                if(compare(array[maxIndex],array[start])<0){
                    maxIndex = start;
                }
            }
            swap(end,maxIndex);
        }
    }
}
