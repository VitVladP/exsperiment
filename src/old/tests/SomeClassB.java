package tests;

public class SomeClassB extends SomeClassA {
    static String test = "from B";


    public  void print(){
        super.print();
        System.out.println("chilld");

    }
    interface HelloWorld{
        void printHello();
    }
    public void inter () {

        class Hello implements HelloWorld{
            @Override
            public void printHello(){
                System.out.println("world");
            }
        }
    }


}
