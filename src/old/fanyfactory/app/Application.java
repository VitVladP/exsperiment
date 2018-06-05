package old.fanyfactory.app;

import old.fanyfactory.chair.Chair;
import old.fanyfactory.factory.Factory;
import old.fanyfactory.factory.impl.LoftCreator;
import old.fanyfactory.factory.impl.ModernCreator;
import old.fanyfactory.sofa.Sofa;

import java.util.EnumMap;

public class Application {

    enum Style{
        LOFT,MODERN
    }

    private Chair chair;
    private Sofa sofa;

    private static final EnumMap<Style, Factory> map = new EnumMap<>(Style.class);


    static {
        map.put(Style.LOFT, new LoftCreator());
        map.put(Style.MODERN, new ModernCreator());
    }
    public Application(String style) {


       Factory  factory =  map.get(Style.valueOf(style));
        chair = factory.getChair();
        sofa =  factory.getSofa();

    }

    public void print() {
        chair.print();
        chair.printColor();
        sofa.print();
        sofa.printColor();
        sofa.isTransform();

    }


}
