package old.fanyfactory.factory.impl;

import old.fanyfactory.chair.Chair;
import old.fanyfactory.chair.impl.LoftChair;
import old.fanyfactory.factory.Factory;
import old.fanyfactory.sofa.impl.LoftSofa;
import old.fanyfactory.sofa.Sofa;

public class LoftCreator implements Factory {

    @Override
    public Sofa getSofa(){
        return new LoftSofa();
    }
    @Override
    public Chair getChair(){
        return new LoftChair();
    }

    public Sofa getSofa(String color, boolean transform){
        return new LoftSofa(color, transform);
    }

    public Chair getChair(String color){
        return new LoftChair(color);
    }


}
