package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * specific strategy to sort array
 * @author Бобков Илья
 */
public class QuickSort implements SortStrategy {

    /**
     * that method performs quick sort
     * @param array that need to be sorting
     * @return sorted array
     */
    @Override
    public int[] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int pivotIndex = array.length / 2;
        int pivot = array[pivotIndex];

        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (i == pivotIndex) {
                continue;
            }
            if (array[i] <= pivot) {
                less.add(array[i]);
            } else {
                greater.add(array[i]);
            }
        }

        int[] lessArray = less.stream().mapToInt(Integer::intValue).toArray();
        int[] greaterArray = greater.stream().mapToInt(Integer::intValue).toArray();

        int[] sortedLess = sort(lessArray);
        int[] sortedGreater = sort(greaterArray);

        return concatenate(sortedLess, pivot, sortedGreater);
    }

    /**
     * combines 3 parts of arrays to one sorted array
     * @param less part of all arrays
     * @param pivot middle element of arrays
     * @param greater part of all arrays
     * @return sorted array
     */
    private int[] concatenate(int[] less, int pivot, int[] greater) {
        int[] result = new int[less.length + 1 + greater.length];
        System.arraycopy(less, 0, result, 0, less.length);
        result[less.length] = pivot;
        System.arraycopy(greater, 0, result, less.length + 1, greater.length);
        return result;
    }

}
