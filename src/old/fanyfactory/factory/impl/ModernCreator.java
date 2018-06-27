package old.fanyfactory.factory.impl;

import old.fanyfactory.chair.Chair;
import old.fanyfactory.chair.impl.ModernChair;
import old.fanyfactory.factory.Factory;
import old.fanyfactory.sofa.impl.ModernSofa;
import old.fanyfactory.sofa.Sofa;

public class ModernCreator implements Factory {

    @Override
    public Sofa getSofa(){
        return new ModernSofa();
    }
    @Override
    public Chair getChair(){
        return new ModernChair();
    }

//    public Sofa getSofa(String color, boolean transform){
//        return new ModernSofa(color, transform);
//    }
//
//    public Chair getChair(String color){
//        return new ModernChair(color);
//    }


}
