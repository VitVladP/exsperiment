package com.comparators;

import java.util.*;

class LastNameComp implements Comparator<String> {

    public int compare(String strA, String strB) {
        int i, j;
        i = strA.lastIndexOf(' ');
        j = strB.lastIndexOf(' ');
        return strA.substring(i).compareToIgnoreCase(strB.substring(j));
    }

}

class firstNameComp implements Comparator<String> {

    public int compare(String strA, String strB) {
        return strA.compareToIgnoreCase(strB);
    }

}

class Demo {
    public static void main(String[] args) {
        Comparator<String> compLN = (String strA, String strB) -> {
            int i, j;
            i = strA.lastIndexOf(' ');
            j = strB.lastIndexOf(' ');
            return strA.substring(i).compareToIgnoreCase(strB.substring(j));
        };

        Comparator<String> com = compLN.thenComparing(new firstNameComp());
        TreeMap<String, Double> tree = new TreeMap<>(com);
        tree.put("Vet Surfer", 1000.);
        tree.put("Dude Surfer", 1000.);
        tree.put("Vet Dude", 2000.);
        tree.put("Alex Fraid", 1000.);

        for (Map.Entry<String, Double> entry : tree.entrySet()
                ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

    }

}
