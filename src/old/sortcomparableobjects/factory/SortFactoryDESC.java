package old.sortcomparableobjects.factory;

import old.sortcomparableobjects.sort.SortDESC;
import old.sortcomparableobjects.sort.SortInterface;

public class SortFactoryDESC<T extends Comparable<T>> implements SortFactory<T> {

    @Override
    public SortInterface<T> getSort() {
        return new SortDESC<>();
    }


}
