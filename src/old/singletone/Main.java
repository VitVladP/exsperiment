package old.singletone;

public class Main {
    public static void main(String[] args) {
        System.out.println("lets try single");
        //SingleTon first  = SingleTon.getInstance("Dude");
        //SingleTon second  = SingleTon.getInstance("surfer");

        //System.out.println("First ton : " + first.value );
        //System.out.println("Second ton : " + second.value );
        Thread dude = new Thread(new threadFoo());
        Thread surfer = new Thread(new threadSurfer());
        dude.start();
        surfer.start();
    }

    static class threadFoo implements Runnable {
        @Override
        public void run() {
            SingleTon dude = SingleTon.getInstance("dude");
            System.out.println(dude.value);
        }
    }
    static class threadSurfer implements Runnable {
        @Override
        public void run(){
         SingleTon surfer = SingleTon.getInstance("surfer");
            System.out.println(surfer.value);
        }
    }
}
