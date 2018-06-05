package old.sortcomparableobjects.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortRandom<T extends Comparable<T>> implements SortInterface<T> {

    @Override
    public void sort(T[] array) {
        Collections.shuffle(Arrays.asList(array));
    }
}
