package com.company.algorithm.sort;


import java.util.Random;

public class SortUtils {
    public static int[] getArray(int length){
        int[] array = new int[length];
        Random random = new Random();
        for(int i=0;i<length;i++){
            array[i] = random.nextInt(length);
        }
        return array;

    }
}
