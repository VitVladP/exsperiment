package old.company;

public class OuterClass {
    private static int number = 0;
    static class Inner {
        int inNumber = 3;
        private static void test(){
            System.out.println(number);
        }
    }
    static void doSomething (){
        Inner.test();
        System.out.println();
    }


}
