package old.factorypart1.service;

import old.factorypart1.sortclass.SortDESC;
import old.factorypart1.sortclass.Sorter;

public class SortClassDESC<T extends Number> extends SortClass <T>{
    @Override
    public Sorter<T> createSortObject(){
    return new SortDESC<>();
    }

}
