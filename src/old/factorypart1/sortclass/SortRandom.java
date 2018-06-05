package old.factorypart1.sortclass;

import java.util.Arrays;
import java.util.Collections;

public class SortRandom<T extends Number> implements Sorter<T> {

    @Override
    public void sort (T[] array){
        Collections.shuffle(Arrays.asList(array));
    }
}
