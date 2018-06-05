package singletone;

public class SingleTon {

    private static volatile SingleTon instance;
    public String value;

    private SingleTon (String value){
         this.value = value;
    }
    public static SingleTon getInstance(String value) {
        if (instance == null)
            synchronized (SingleTon.class){
            if (instance == null)
                instance = new SingleTon(value);
            }

            return instance;
    }
}
