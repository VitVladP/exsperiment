package newstreamproject.person;

import newstreamproject.enumb.Ability;

public class Admin extends User {

    private Ability ability;

    public Admin(String name, String level) {
        super(name, level);
    }

    public Admin(String name, String level, Ability ability) {
        super(name, level);
        this.ability = ability;
    }




    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Admin(User user){
        super (user.getName(),user.getLevel());
        this.ability = Ability.valueOf(user.getName().toUpperCase());
    }

    @Override
    public String toString() {
        return "name: "+ name + " ability: "+ ability.getAbility();
    }
}
