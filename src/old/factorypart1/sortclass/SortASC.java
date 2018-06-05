package old.factorypart1.sortclass;

import java.util.Arrays;
import java.util.Collections;

public class SortASC  <T extends Number> implements Sorter <T> {

    @Override
    public void sort(T[] array){
        Arrays.sort(array, Collections.reverseOrder());
    }
}
