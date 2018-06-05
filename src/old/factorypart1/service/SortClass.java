package old.factorypart1.service;
import old.factorypart1.sortclass.Sorter;

public abstract class SortClass  <T extends Number> {
        public void sortItBro(T[] array){
            Sorter<T> sortWay  = createSortObject();
            sortWay.sort(array);
        }

        public abstract Sorter<T> createSortObject();
}
