package old.mycollection;

import old.mycollection.mycoll.MyCollection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> my = new MyCollection<>();

        my.add(7);
        my.add(9);
        my.add(5);
        my.add(4);
        my.add(9);
        my.add(6);
        my.add(1);
        my.add(3);
        System.out.println(MyCollection.getCount());
        System.out.println(my);
    }
}
