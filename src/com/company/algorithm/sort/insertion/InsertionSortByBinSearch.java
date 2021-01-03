package com.company.algorithm.sort.insertion;


import com.company.algorithm.sort.Sort;

/**
 * 通过二分查找优化插入排序
 * 思路：通过二分查找找出待排序元素在已排序数组中带插入的位置
 */
public class InsertionSortByBinSearch extends Sort {
    @Override
    protected void sort() {
        for(int begin = 1;begin<array.length;begin++){
            int insertIndex = search(begin);
            int element = array[begin];
            int cur = begin;
            while(cur>insertIndex){
                swapCount++;
                array[cur] = array[cur-1];
                cur--;
            }
            array[insertIndex] = element;

        }

    }
    int search(int index){
        int begin = 0;
        int end = index;
        while(end>begin){
            int mid = (begin+end)/2;
            if(compare(array[index],array[mid])<0){
                end = mid;
            }else{
                begin = mid+1;
            }
        }
        return begin;

    }
}
