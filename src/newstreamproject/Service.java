package newstreamproject;

import newstreamproject.mapper.User2Admin;
import newstreamproject.person.Admin;
import newstreamproject.person.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Vetal", "looser"),
                new User("Kirill", "GOD"),
                new User("Valdemar", "middle"),
                new User("Surfer", "middle"));

        Map <String, List<Admin>> admins =
                users
                        .stream()
                        .map(Admin::new)
                        .collect(Collectors.groupingBy(User::getLevel));
        System.out.println(admins);
        List<Admin> adminList = new ArrayList<>();
        for (User user : users
                ) {
            adminList.add(User2Admin.convertUser2Admin(user));

        }

        adminList.forEach(System.out::println);
    }
}
