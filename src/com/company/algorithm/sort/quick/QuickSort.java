package com.company.algorithm.sort.quick;

import com.company.algorithm.sort.Sort;

public class QuickSort extends Sort {

    @Override
    protected void sort() {
        sort(0,array.length);

    }

    /**
     * 对[begin,end)范围内进行排序
     * @param begin
     * @param end
     */
    private void sort(int begin, int end) {
        if(end-begin<2) return;
        int mid = pivotIndex(begin,end);
        sort(begin,mid);
        sort(mid+1,end);


    }

    /**
     * [begin,end)
     * 返回轴点的最终位置索引（每次排序都能确定一个轴点的最终位置）
     * @param begin
     * @param end
     * @return
     */

    private int pivotIndex(int begin, int end) {
        end--;
        int pivotElement = array[begin];
        boolean flag = true;//flag用来区分从数组头或者尾比较，为true表示从尾部向前比较
        while(begin!=end){
            if(flag){
                if(compare(array[end],pivotElement)<0){
                    //如果尾部元素小于轴点元素，则把该元素放入begin位置
                    //同时begin++，调转比较方向(flag=false),从begin+1处与轴点元素比较
                    array[begin] = array[end];
                    begin++;
                    flag=false;
                }else{
                    //如果尾部元素大于轴点元素，则不需要移动该元素位置，end--后再与轴点元素比较
                    end--;
                }

            }else{
                if(compare(array[begin],pivotElement)>0){
                    array[end] = array[begin];
                    end--;
                    flag=true;
                }else{
                    begin++;
                }

            }

        }
        array[begin] = pivotElement;
        return begin;

    }
}
