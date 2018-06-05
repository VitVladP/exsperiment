package old.mycollection.mycoll;

import java.util.ArrayList;

public class MyCollection<E extends Number> extends ArrayList<E> {
    private static int count = 0;

    @Override
    public boolean add(E element) {

        int index = getIndex(element);

        if (index != this.size()-1) {
                 super.add(index, element);
        } else {
            if ( this.size() < 2) {super.add(element);}else
            super.add(element);
        }
        count++;
        return true;
    }

    public static int getCount() {
        return count;
    }

    private int getIndex(E element) {
        int index = 0;
        for (E elem :
                this) {
            index = this.indexOf(elem);
            if (elem instanceof Integer) {
                if ((Integer) elem - (Integer) element > 0) {
                    return index;
                }
            }
        }
        return index;
    }

}
