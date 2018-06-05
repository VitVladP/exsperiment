package old.sortcomparableobjects.service;
import old.sortcomparableobjects.factory.*;
import old.sortcomparableobjects.sort.SortInterface;

import java.util.EnumMap;

public class SortMyArray {

    enum SortBy{
        ASC,DESC, RANDOM
    }

     public static <T extends Comparable<T>> void sortArray(T[] array,String sortMethod){
        EnumMap<SortBy,SortFactory<T>> map = new EnumMap<>(SortBy.class);
        map.put(SortBy.ASC, new SortFactoryASC<>());
        map.put(SortBy.DESC, new SortFactoryDESC<>());
        map.put(SortBy.RANDOM, new SortFactoryRandom<>());

        SortInterface sorter = map.get(SortBy.valueOf(sortMethod)).getSort();
        sorter.sort(array);
    }
}
