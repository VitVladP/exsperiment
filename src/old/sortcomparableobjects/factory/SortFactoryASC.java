package old.sortcomparableobjects.factory;

import old.sortcomparableobjects.sort.*;

public class SortFactoryASC<T extends Comparable<T>> implements SortFactory<T>  {

    @Override
    public SortInterface<T> getSort() {
        return new SortASC<>();
    }


}
