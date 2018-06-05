package old.factorypart1.service;

import old.factorypart1.sortclass.SortRandom;
import old.factorypart1.sortclass.Sorter;

public class SortClassRandom<T extends Number> extends SortClass <T>{
    @Override
    public Sorter<T> createSortObject(){ return new SortRandom<>();
    }

}
