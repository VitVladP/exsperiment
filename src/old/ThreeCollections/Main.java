package com.ThreeCollections;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<ClassA> myset = ClassA.AddElements.createSet(100);
       // HashSet<ClassA> arrSet[] = ClassA.SortElements.separateSet(myset);
        HashSet<ClassA> arrSet[] = ClassA.SortElements.simpleSearator(myset);
        ClassA.PrintElements.print(arrSet);
    }
}
