package stream;

public class Person {
     String name;
     int age;
     String descr;

    public Person(String name, int age, String descr) {
        this.name = name;
        this.age = age;
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("name : %s, age: %d",name,age);
    }
}
