package old.fanyfactory.factory;

import old.fanyfactory.chair.Chair;
import old.fanyfactory.sofa.Sofa;

public interface Factory {
        Chair getChair();
        Sofa getSofa();
}
