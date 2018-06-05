package old.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 5 ; i++) {
//            new Thread(new LiftOff()).start();
//        }

        ExecutorService exec = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            //exec.execute(new threads.LiftOff());


        }
        exec.shutdown();

    }
}
