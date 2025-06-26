package org.example;

/**
 * a specific strategy to sort arrays
 * @author Бобков Илья
 */
public class ChoiceSort implements SortStrategy {

    /**
     * that method performs choice sorting
     * @param array that need to be sorting
     * @return sorted array
     */
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int elem = array[i];
            array[i] = array[minIndex];
            array[minIndex] = elem;
        }
        return array;
    }

}
