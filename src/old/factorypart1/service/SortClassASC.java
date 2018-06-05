package old.factorypart1.service;

import old.factorypart1.sortclass.SortASC;
import old.factorypart1.sortclass.Sorter;

public class SortClassASC <T extends Number> extends SortClass <T>{
    @Override
    public Sorter<T> createSortObject(){
    return new SortASC<>();
    }

}
