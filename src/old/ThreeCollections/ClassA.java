package com.ThreeCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ClassA {
    private Type type;
    private int id;

    enum Type {
        ONE(1), TWO(2), THREE(3);
        private final int value;

        Type(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    ClassA(Type type) {
        this.type = type;
        id = (int) (Math.random() * 100 + 1);
    }

    public Type getType() {
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;

        ClassA classA = (ClassA) o;

        if (id != classA.id) return false;
        return type == classA.type;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return String.format("{\"id\":\"%d\",\"type\":\"%s\"}", id, type);
    }

    public static class AddElements {
        public static HashSet<ClassA> createSet(int countElements) {
            HashSet<ClassA> set = new HashSet<>();
            while (set.size() < countElements)
                set.add(new ClassA(generateType()));
            return set;
        }

        private static Type generateType() {
            return Arrays.stream(Type.values())
                    .filter(it -> it.getValue() == (1 + (int)(Math.random() * (3 - 1)) + 1))
                    .findAny()
                    .orElse(Type.ONE);
        }
    }

    public static class PrintElements {
            public static void print (HashSet<ClassA> set){
                System.out.println(set);
                }

            public static void print (HashSet<ClassA>[] arrSet ){
                for (HashSet<ClassA> set:
                     arrSet) {
                    print(set);
                }
            }
    }

    public static class SortElements {
        public static HashSet<ClassA> getOneType(HashSet<ClassA> set, ClassA.Type type) {
            HashSet<ClassA> temp = new HashSet<>();
            Iterator<ClassA> iterator = set.iterator();
            while (iterator.hasNext()) {
                ClassA element = iterator.next();
                if (element.getType() == type) {
                    temp.add(element);
                    iterator.remove();
                }
            }
            return temp;
        }

        /**
        * Данный метод написал с ходу
        * */
        public static HashSet<ClassA>[] separateSet(HashSet<ClassA> set) {
            ClassA.Type types[] = ClassA.Type.values();
            HashSet<ClassA> arrSet[] = new HashSet[types.length];
            for (int i = 0; i < types.length - 1; i++) {
                arrSet[i] = getOneType(set, types[i]);            }
            arrSet[types.length - 1] = set;
            return arrSet;

        }
        /**
        *Данный метот производит разделение элементов множестав соласно типу.
        * переработанный метод.
        * */
        public static HashSet<ClassA>[] simpleSearator (HashSet<ClassA> set){
            HashSet<ClassA> arrSet[] = new HashSet[Type.values().length];
            for (ClassA element:
                 set) {
                if (arrSet[element.getType().ordinal()] == null) arrSet[element.getType().ordinal()] = new HashSet<>();
                arrSet[element.getType().ordinal()].add(element);
            }
            return arrSet;
        }
    }



}
