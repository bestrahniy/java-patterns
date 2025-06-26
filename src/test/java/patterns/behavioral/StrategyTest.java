package patterns.behavioral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    private int[] array;
    private SortStrategy bubble;
    private SortStrategy quick;
    private SortStrategy choice;

    @BeforeEach
    void init(){
        this.array = new int[]{5, 3, 6, 1, 6 ,1, 13};
        this.bubble = new BubbleSort();
        this.quick = new QuickSort();
        this.choice = new ChoiceSort();
    }

    @Test
    void bubbleTest() {
        Sorter sorter = new Sorter(array);
        sorter.getSort(bubble);
        int[] expexted = new int[]{1, 1, 3, 5, 6, 6, 13};
        int[] actual = sorter.performSort();
        assertArrayEquals(expexted, actual);
    }

    @Test
    void quickTest() {
        Sorter sorter = new Sorter(array);
        sorter.getSort(quick);
        int[] expexted = new int[]{1, 1, 3, 5, 6, 6, 13};
        int[] actual = sorter.performSort();
        assertArrayEquals(expexted, actual);
    }

    @Test
    void choiceTest(){
        Sorter sorter = new Sorter(array);
        sorter.getSort(choice);
        int[] expexted = new int[]{1, 1, 3, 5, 6, 6, 13};
        int[] actual = sorter.performSort();
        assertArrayEquals(expexted, actual);
    }

    @Test
    void usingCorrectlyStrategy(){
        Sorter sorter = new Sorter(array);
        sorter.getSort(choice);
        sorter.getSort(quick);
        int[] expexted = new int[]{1, 1, 3, 5, 6, 6, 13};
        int[] actual = sorter.performSort();
        assertArrayEquals(expexted, actual);
    }

}
