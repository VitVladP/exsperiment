package newstreamproject.mapper;

import newstreamproject.enumb.Ability;
import newstreamproject.person.Admin;
import newstreamproject.person.User;

public class User2Admin {

    public static Admin convertUser2Admin (User user){
        Admin admin;
        if (user == null) return null;
        admin = new Admin(user.getName(),user.getLevel(), Ability.valueOf(user.getName().toUpperCase()));
        return admin;
    }
}
