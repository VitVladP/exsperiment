package old.factorypart1;

import old.factorypart1.service.SortClass;
import old.factorypart1.service.SortClassASC;
import old.factorypart1.service.SortClassDESC;
import old.factorypart1.service.SortClassRandom;

import java.util.EnumMap;

public class Service {

    enum SortWay{
        ASC,
        DESC,
        RANDOM
    }

    static <T extends Number>void sortMyArray (T[] arr, String way){
        EnumMap<SortWay,SortClass<T>> mySort = new EnumMap<>(SortWay.class);
        mySort.put(SortWay.ASC,  new SortClassASC<>());
        mySort.put(SortWay.DESC,  new SortClassDESC<>());
        mySort.put(SortWay.RANDOM,  new SortClassRandom<>());

        mySort.get(SortWay.valueOf(way)).sortItBro(arr);
    }
}
