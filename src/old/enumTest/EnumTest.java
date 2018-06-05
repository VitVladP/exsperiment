package old.enumTest;


public enum EnumTest {

    DEBIT{
        public void doSomething(){
        System.out.println("Давай кредит");
    }

    },
    CREDIT{
        public void doSomething(){
        System.out.println("давай дебетить");
    } ;},
    TEMP{

    };

    public void doSomething(){
        System.out.println("something");
    }





}