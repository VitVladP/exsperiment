package old.fanyfactory;

import old.fanyfactory.app.Application;

public class main {

    public static void main(String[] args) {
        Application app = config();
        app.print();
    }

    public static Application config (){
        Application app;
        app = new Application("LOFT");
        return app;
    }
}
