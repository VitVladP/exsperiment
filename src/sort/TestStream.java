package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList() {{
            add("test 1");
            add("test 2");
        }};

        List<String> array = Arrays.asList("aa1", "cc2", "cc1", "aa2", "bb1");

        Stream.of("dd1", "cc2", "cc1", "aa2", "bb1").filter(s -> {
            System.out.println("Filter: " + s);
            return true;
        }).forEach(s -> System.out.println("Print in foreach " + s));


        Stream.of("dd3", "cc2", "aa1", "ff2", "bb1")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s->{
                    System.out.println("anyMach: " + s);
                    return s.startsWith("A");
                });


        Stream.of("a","b","c","d","e")
                .sorted((s1,s2)->{
                    return -1;
                })
                .forEach(System.out::println );

        System.out.println("+++++++++++++++++++Separate+++++++++++++++++");

        Stream.of("dd2", "aa2", "bb1", "bb3", "aa4")
                .sorted((s1,s2)->{
                    System.out.printf("sort: %s; %s \n",s1,s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: "+ s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));



//        list.stream().reduce((a, b) -> (a + " " + b)).ifPresent(System.out::println);
//        String str = list.stream().reduce("",(a,b)->(a+" "+b));
//        System.out.println(str);


//        List<User> users = Arrays.asList(new User("Kirill", " God"), new User("Vitalic", "Low"));
//        List<String> collect = users.stream().map(User::getName).collect(Collectors.toList());

//        List<Admin> admins =
//                users.stream().map((a)->
//                new Admin(a.getName(),a.getLevel(),Ability.valueOf(a.getName()))).forEach(System.out::println);

        //users.stream().flatMap(Admin::);


//        stream.filter(s -> (s.equals("test 2"))).map(s -> s = "cool").forEach(System.out::println);

    }


    static class Admin extends User {

        private TestStream.Ability ability;

        public Admin(String name, String level) {
            super(name, level);
        }

        public Admin(String name, String level, Ability ability) {
            super(name, level);
            this.ability = ability;
        }

        public Ability getAbility() {
            return ability;
        }

        @Override
        public String toString() {
            return String.format("User name: %s, level: %s, Ability: %s", getName(), getLevel(), getAbility());
        }
    }

    public enum Ability {
        Kirill("Can do everything"), Vitalic("Can do something wrong");

        private final String description;

        Ability(String description) {
            this.description = description;
        }
    }


    static class User {
        private String name;
        private String level;

        public User(String name, String level) {
            this.name = name;
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public String getLevel() {
            return level;
        }
    }
}
