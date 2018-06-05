package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Vet", 25),
                new Person("Surfer", 25),
                new Person("Surfer", 28),
                new Person("Dude", 34),
                new Person("Derek", 34),
                new Person("Bro", 20)
        );

        List<Person> filt =
                persons
                        .stream()
                        .filter(p -> p.getName().startsWith("D"))
                        .collect(Collectors.toList());
        System.out.println(filt);

        Map<Integer, List<Person>> personByAge =
                persons
                        .stream()
                        .collect(Collectors.groupingBy(p -> p.age));
        personByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));


        String joining =
                persons
                        .stream()
                        .filter(person -> person.age >= 25)
                        .map(person -> person.name)
                        .collect(Collectors.joining(" and ", "In Greman ", " competition"));

        System.out.println(joining);

        Map<Integer, String> map =
                persons
                        .stream()
                        .collect(Collectors.toMap(
                                Person::getAge,
                                Person::getName,
                                (name1, name2) -> name1 + ";" + name2)

                        );
        System.out.println(map);

        List<Foo> foos = new ArrayList<>();

        IntStream
                .range(3, 5)
                .forEach(i -> foos.add(new Foo("Foo" + i)));

    }
}

class Foo {
    String name;
    List<Bar> bars = new ArrayList<>();

    public Foo(String name) {
        this.name = name;
    }
}

class Bar {
    String name;

    public Bar(String name) {
        this.name = name;
    }
}
