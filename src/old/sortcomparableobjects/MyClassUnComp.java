package old.sortcomparableobjects;

public class MyClassUnComp {
    String name;

    MyClassUnComp(String name){
        this.name = name;

    }

    @Override
    public String toString (){
        return String.format("%s ",name);
    }
    }


