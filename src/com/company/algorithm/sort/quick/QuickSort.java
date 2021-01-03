package com.company.algorithm.sort.quick;

import com.company.algorithm.sort.Sort;

public class QuickSort extends Sort {

    @Override
    protected void sort() {
        int begin = 0,end = array.length;
        sort(begin,end);

    }

    private void sort(int begin, int end) {
        int copyElement = array[begin];
        while(begin!=end){
            if(compare(array[begin]))
        }
    }
}
