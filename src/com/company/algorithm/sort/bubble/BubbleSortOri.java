package com.company.algorithm.sort.bubble;

/**
 * @Description TODO
 * @Author wangkai
 * @Date 2024/3/13 14:15
 */
public class BubbleSortOri {



    public static void sort(int[] arr){

        for(int i = arr.length - 1; i >=0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int a:arr) {
            System.out.print(a+"_");
        }
        System.out.println("\n");
    }
}
