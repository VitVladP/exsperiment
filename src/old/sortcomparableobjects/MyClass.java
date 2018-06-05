package old.sortcomparableobjects;

public class MyClass implements Comparable<MyClass>{
    String name;

    MyClass(String name){
        this.name = name;

    }

    @Override
    public int compareTo(MyClass obj){
        if (name.length() == obj.name.length()) return 0;
        if (name.length() > obj.name.length()) return 1;
        return -1;
        }

    @Override
    public String toString (){
        return String.format("%s ",name);
    }
    }


