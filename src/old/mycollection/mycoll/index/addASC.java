package old.mycollection.mycoll.index;

import java.util.ArrayList;

public class addASC<T extends Number> implements elementIndex<T> {
    @Override
    public int getIndex(ArrayList<T> array, T element){
       return 0;
    }
}
