package com.company.algorithm.test;

/**
 * @Description TODO
 * @Author wangkai
 * @Date 2024/3/8 16:22
 */
public class QuickSortTest {

    public static void sort(int[] array){
        sort(0,array.length-1,array);

        for (int a:array) {
            System.out.print(a+"_");
        }
        System.out.println("\n");



    }

    public static void sort(int left,int right,int[] array){
        if(right - left < 1){
            return;
        }
        int mid = getMiddle(left,right,array);
        sort(left,mid,array);
        sort(mid+1,right,array);
    }

    private static int getMiddle(int left,int right,int[] array) {

        int pivot = array[left];
        //flag = true表示从尾向前
        boolean flag = true;

        while (left != right){
            if(flag){
                if(array[right] < pivot){
                    array[left] = array[right];
                    left++;
                    flag = false;
                }else{
                    right--;
                }

            }else{

                if(array[left] > pivot){
                    array[right] = array[left];
                    right--;
                    flag = true;
                }else{
                    left++;
                }

            }
        }

        array[left] = pivot;
        return left;
    }
}
