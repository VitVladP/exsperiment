package old.sortcomparableobjects.sort;


public interface SortInterface <T extends Comparable<T>> {
    void sort(T[] array);
}
