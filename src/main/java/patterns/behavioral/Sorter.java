package patterns.behavioral;

/**
 * main class that defines which sort method use
 * @author Бобков Илья
 */
public class Sorter {

    private SortStrategy sortStrategy;

    private int[] array;

    public Sorter(int[] data) {
        this.array = data;
    }

    /**
     * determine object subclass sort
     * @param sort sort object that we use
     */
    public void getSort(SortStrategy sort) {
        this.sortStrategy = sort;
    }

    /**
     * show on screen which sorting we use
     * and call sort method
     * @return sort method of the desired sorting
     */
    public int[] performSort() {
        System.out.printf("использована стратегия: %s", sortStrategy.toString());
        return sortStrategy.sort(array);
    }

}
