package test;


public class MyComparableClass implements Comparable<MyComparableClass> {
    private String name;
    MyComparableClass(String name){
        this.name = name;
    }

    @Override
    public int compareTo(MyComparableClass o1) {
        if (o1.name.length() == this.name.length()) return 0;
        if (o1.name.length() < this.name.length()) return 1;
        return -1;
    }

    @Override
    public String toString(){
        return String.format("Name : %s", name);
    }


}
