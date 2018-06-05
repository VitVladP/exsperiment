package old.sortcomparableobjects.factory;

import old.sortcomparableobjects.sort.SortInterface;
import old.sortcomparableobjects.sort.SortRandom;

public class SortFactoryRandom<T extends Comparable<T>> implements SortFactory<T>  {

    @Override
    public SortInterface<T> getSort() {
        return new SortRandom<>();
    }


}
