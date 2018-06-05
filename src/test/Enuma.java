package test;

import java.util.EnumMap;

public class Enuma {

    enum  MyEnam {
        THIRST,SECOND
    }

     void doSomething(){
        EnumMap<MyEnam,MyInterfase> enu = new EnumMap<>(MyEnam.class);
        enu.put(MyEnam.THIRST,new myInnerClass() );
        enu.put(MyEnam.SECOND,new myInnerClass() );
    }

    interface MyInterfase{
        void myMethod();
    }

    class myInnerClass implements MyInterfase{
        @Override
        public void myMethod(){
            System.out.println("fack");
        }
    }
}
