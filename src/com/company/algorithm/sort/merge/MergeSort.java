package com.company.algorithm.sort.merge;

import com.company.algorithm.sort.Sort;

public class MergeSort extends Sort {
    private int[] leftArray;
    @Override
    protected void sort() {
        leftArray = new int[array.length/2];
        sort(0,array.length);
    }

    /**
     * 对[begin,end)索引范围内的值排序
     * @param begin
     * @param end
     */

    private void sort(int begin, int end) {
        if(end-begin<2) return;
        int mid = (begin+end)/2;
        sort(begin,mid);
        sort(mid,end);
        merge(begin,mid,end);
    }

    /**
     * 将[begin,mid)和[mid,end)范围的数值合并成一个有序序列
     */

    private void merge(int begin,int mid,int end) {
        int li = 0,le = mid-begin;//左边数组（基于leftArray）
        int ri = mid,re = end;//右边数组基于array
        int ai = begin;//array的索引
        for(int i = li;i<le;i++){//拷贝数组的左半部分到leftArray
            leftArray[i] = array[begin+i];
        }
        while(li<le){
            if(ri<re&&compare(array[ri],leftArray[li])<0){
                array[ai++] = array[ri++];//拷贝右边数组到array
            }else{
                array[ai++] = leftArray[li++];//拷贝左边数组到array
            }
        }
    }
}
