package patterns.behavioral;

/**
 * interface determines a contract for all methods
 * @author Бобков Илья
 */
public interface SortStrategy {

    /**
     * soring the array of integer element
     * @param array that need to be sorting
     * @return sorted array
     */
    int[] sort(int[] array);

}
