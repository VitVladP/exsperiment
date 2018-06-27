package old.tests;

public class SomeClassC implements SomeClassB.HelloWorld {

    interface HelloWorld{
        int printHello();
    }
    @Override
        public void printHello(){
        System.out.println("hello world!");
    }
}
