package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<MyComparableClass> mass = new ArrayList<>();
    MyComparableClass[] arr = new MyComparableClass[3];
    arr[0] = new MyComparableClass("Surfer");
    arr[1] = new MyComparableClass("vet");
    arr[2] = new MyComparableClass("dude");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    mass.add(new MyComparableClass("Surfer"));
    mass.add(new MyComparableClass("vet"));
    mass.add(new MyComparableClass("dud"));
        System.out.println(mass);
        Collections.sort(mass);
        System.out.println(mass.toString());


    }
}
