package com.company.algorithm.sort;

import com.sun.javafx.util.Logging;
import sun.rmi.runtime.Log;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.logging.Logger;

public abstract  class Sort {
    protected  int[] array = null;
    protected  int compareCount = 0;
    protected  int swapCount = 0;
    long time_consuming = 0;




    public void sort(int[] array){
        long start = System.currentTimeMillis();
        this.array = array;
        if(this.array==null||this.array.length<2) return;
        sort();
        long end = System.currentTimeMillis();
        time_consuming = end - start;
        print();

    }
    protected abstract void sort();

    protected int compare(int x,int y){

        compareCount++;
        return x-y;

    }

    protected void swap(int i1,int i2){
        swapCount++;
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;

    }





    public  void print(){
       // StackTraceElement[] stackTraceElement = new Throwable().getStackTrace();

        //String className = new Throwable().getStackTrace()[1].getClassName()+"";

        System.out.println(getClass().getSimpleName());
        System.out.println("耗时："+time_consuming+"ms");
       // System.out.println(new Object(){}.getClass().getEnclosingClass());
        System.out.println("比较次数"+compareCount);
        System.out.println("交换次数"+swapCount);

        for (int a:array
        ) {
            System.out.print(a+"_");
        }
        System.out.println("\n");
    }

}
