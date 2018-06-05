package old.sortcomparableobjects;

import old.sortcomparableobjects.service.SortMyArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass array[] = new MyClass[]
                {
                        new MyClass("Surfer"),
                        new MyClass("dude"),
                        new MyClass("killer"),
                        new MyClass("refactoring"),
                        new MyClass("student")

                };

        SortMyArray.sortArray(array,"RANDOM");
        System.out.println(Arrays.toString(array));
        MyClassUnComp array1[] = new MyClassUnComp[]
                {
                        new MyClassUnComp("Surfer"),
                        new MyClassUnComp("dude"),
                        new MyClassUnComp("killer"),
                        new MyClassUnComp("refactoring"),
                        new MyClassUnComp("student")

                };

        SortMyArray.sortArray(array,"RANDOM");
        System.out.println(Arrays.toString(array));
    }
}
