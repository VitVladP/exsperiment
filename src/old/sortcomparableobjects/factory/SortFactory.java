package old.sortcomparableobjects.factory;

import old.sortcomparableobjects.sort.SortInterface;

public interface SortFactory <T extends Comparable<T>>  {
     SortInterface<T> getSort();

}
