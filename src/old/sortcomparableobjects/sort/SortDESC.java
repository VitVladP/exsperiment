package old.sortcomparableobjects.sort;

import java.util.Arrays;

public class SortDESC<T extends Comparable<T>> implements SortInterface<T> {

    @Override
    public void sort(T[] array) {
        Arrays.sort(array);
    }
}
