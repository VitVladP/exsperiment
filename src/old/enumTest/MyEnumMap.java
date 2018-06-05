package old.enumTest;

import java.util.EnumMap;

public class MyEnumMap {


}

enum Actions {
    DEBIT, CREDIT, DEFAULT
}

class MyActions {
     static void doSomething(String action) {

        EnumMap<Actions, Flow> map = new EnumMap<>(Actions.class);
        map.put(Actions.DEBIT, () -> System.out.println("Debit"));
        map.put(Actions.CREDIT, () -> System.out.println("Credit"));
        map.put(Actions.DEFAULT, () -> System.out.println("Default action"));

        map.get(Actions.valueOf(action)).doSomeAction();
    }

}

@FunctionalInterface
interface Flow {
    void doSomeAction();
}
