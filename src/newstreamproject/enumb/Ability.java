package newstreamproject.enumb;

public enum Ability {
    VETAL ("Can do something"),
    KIRILL ("Gods mode"),
    VALDEMAR(" middle dev"),
    SURFER ("No java just waves!");

    private String ability;

    Ability (String ability){
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }
}
