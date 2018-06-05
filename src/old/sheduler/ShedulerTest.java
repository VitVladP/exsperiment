package old.sheduler;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.concurrent.*;

public class ShedulerTest {
    public static void main(String[] args) throws InterruptedException {
        someThing();
        someThing1();
        someThing2();
    }


    public static Calendar setTime(int hour, int minutes, int seconds) {
        Calendar time = new GregorianCalendar();
        time.set(Calendar.HOUR, hour - 12);
        time.set(Calendar.MINUTE, minutes);
        time.set(Calendar.SECOND, seconds);
        return time;
    }

    public static void someThing1() throws InterruptedException {

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        pool.scheduleWithFixedDelay(() -> {
            for (int i = 0; i < 40; i++) {
                System.out.println("thread one " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, 1, 20, TimeUnit.SECONDS);
        pool.scheduleWithFixedDelay(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("thread two " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, 10, 10, TimeUnit.SECONDS);
        pool.scheduleWithFixedDelay(() -> {
            for (int i = 0; i < 30; i++) {
                System.out.println("thread три " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, 12, 15, TimeUnit.SECONDS);
    }

    public static void someThing2() throws InterruptedException {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(4);
        Timer timer = new Timer();
        pool.schedule(new ShedulerTask("first task"), 10, TimeUnit.SECONDS);
        pool.schedule(new ShedulerTask("second task"), 10, TimeUnit.SECONDS);
        pool.schedule(new ShedulerTask("third task"), 10, TimeUnit.SECONDS);
        Thread.currentThread().sleep(1000 * 30);
        System.out.println("lets finish this");
        pool.shutdownNow();

        System.out.println("hmm");
    }

    public static void someThing() throws InterruptedException {
        Calendar time;
        time = setTime(16, 48, 0);
        System.out.println(time.getTime());
        Timer timer = new Timer();
        Timer timer1 = new Timer();
        timer.schedule(new ShedulerTask("first task"), time.getTime());
        timer.schedule(new ShedulerTask("second task"), time.getTime());
        time = setTime(16, 48, 0);
        timer1.schedule(new ShedulerTask("third task"), time.getTime());
        Thread.sleep(1000 * 60);
        System.out.println("lets end this part");
        // System.exit(0);
        timer.cancel();
        timer1.cancel();
    }
}
