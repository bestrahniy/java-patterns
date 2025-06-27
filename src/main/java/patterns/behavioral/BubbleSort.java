package patterns.behavioral;

/**
 * specific strategy to sort array
 * @author  Бобков Илья
 */
public class BubbleSort implements SortStrategy {

    /**
     * that method performs bubble sorting
     * @param array that need to be sorting
     * @return sorted array
     */
    @Override
    public int[] sort(int[] array) {
        int k = array.length;
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int elem = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = elem;
                }
            }
            k++;
        }
        return array;
    }

}
