package old.sheduler;

import java.util.Date;
import java.util.TimerTask;

public class ShedulerTask extends TimerTask {
    String name;
    public ShedulerTask (String name){
        this.name = name;
    }
    @Override
    public void run() {

        for (int i=0; i<5;i++) {
            Date now = new Date();
            System.out.println(i + "lets dance dud! name: " + name + " : " + now);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("name " + name + "is ended!");
        }
        //Thread.currentThread().stop();
    }

}
