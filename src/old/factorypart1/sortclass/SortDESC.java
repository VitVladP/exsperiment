package old.factorypart1.sortclass;

import java.util.Arrays;

public class SortDESC <T extends Number> implements Sorter<T> {
    @Override
    public void sort(T[] array){
        Arrays.sort(array);
    }
}
