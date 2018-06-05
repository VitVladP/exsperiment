package old.sortcomparableobjects.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortASC<T extends Comparable<T>> implements SortInterface<T> {

    @Override
    public void sort(T[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }
}
