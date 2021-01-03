package com.company.algorithm.sort;

import com.company.algorithm.sort.bubble.BubbleSort;
import com.company.algorithm.sort.bubble.BubbleSortAdvance;
import com.company.algorithm.sort.insertion.BinarySearch;
import com.company.algorithm.sort.insertion.InsertionSort;
import com.company.algorithm.sort.insertion.InsertionSortAdvanced;
import com.company.algorithm.sort.insertion.InsertionSortByBinSearch;
import com.company.algorithm.sort.merge.MergeSort;
import com.company.algorithm.sort.selection.SelectionSort;

public class Main {
    public static void main(String[] args) {

        int[] array = SortUtils.getArray(10000);

        Sort bubbleSort = new BubbleSort();
        Sort bubbleSortAdvance = new BubbleSortAdvance();
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        Sort insertionSortAdvanced = new InsertionSortAdvanced();
        Sort insertionSortByBinSearch =  new InsertionSortByBinSearch();
        Sort mergeSort =  new MergeSort();

        bubbleSort.sort(array.clone());
        bubbleSortAdvance.sort(array.clone());
        selectionSort.sort(array.clone());
        insertionSort.sort(array.clone());
        insertionSortAdvanced.sort(array.clone());
        insertionSortByBinSearch.sort(array.clone());
        mergeSort.sort(array.clone());

        //BinarySearch.getIndex(array,5);


    }
}
