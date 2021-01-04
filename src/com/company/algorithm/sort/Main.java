package com.company.algorithm.sort;

import com.company.algorithm.sort.bubble.BubbleSort;
import com.company.algorithm.sort.bubble.BubbleSortAdvance;
import com.company.algorithm.sort.insertion.BinarySearch;
import com.company.algorithm.sort.insertion.InsertionSort;
import com.company.algorithm.sort.insertion.InsertionSortAdvanced;
import com.company.algorithm.sort.insertion.InsertionSortByBinSearch;
import com.company.algorithm.sort.merge.MergeSort;
import com.company.algorithm.sort.quick.QuickSort;
import com.company.algorithm.sort.selection.SelectionSort;

public class Main {
    public static void main(String[] args) {

        int[] array = SortUtils.getArray(15000);

        Sort bubbleSort = new BubbleSort();
        Sort bubbleSortAdvance = new BubbleSortAdvance();
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        Sort insertionSortAdvanced = new InsertionSortAdvanced();
        Sort insertionSortByBinSearch =  new InsertionSortByBinSearch();
        Sort mergeSort =  new MergeSort();
        Sort quickSort =  new QuickSort();

        bubbleSort.sort(array.clone());
        bubbleSortAdvance.sort(array.clone());
        selectionSort.sort(array.clone());
        insertionSort.sort(array.clone());
        insertionSortAdvanced.sort(array.clone());
        insertionSortByBinSearch.sort(array.clone());
        mergeSort.sort(array.clone());
        quickSort.sort(array.clone());

        //BinarySearch.getIndex(array,5);


    }
}
