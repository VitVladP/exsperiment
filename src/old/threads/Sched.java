package threads;


import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.util.concurrent.*;

public class Sched {
    private volatile boolean light = false;
    private volatile boolean water = false;
    private String thermostat = "Day";

    public synchronized String getThermostat() {
        return thermostat;
    }

    public synchronized void setThermostat(String value) {
        thermostat = value;
    }

    ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(10);

    public void schedule(Runnable event, long delay) {
        scheduler.schedule(event, delay, TimeUnit.MILLISECONDS);
    }

    public void repeat(Runnable event, long inityalDelay, long period) {
        scheduler.scheduleAtFixedRate(event, inityalDelay, period, TimeUnit.MILLISECONDS);
    }

    class LightOn implements Runnable {
        @Override
        public void run() {
            System.out.println("Свет включен");
            light = true;
        }
    }
    class LightOff implements Runnable {
        @Override
        public void run() {
            System.out.println("Свет выключен");
            light = false;
        }
    }

    class WaterOn implements Runnable{
        public void run(){
            System.out.println("Полив включен!");
            water = true;
        }
    }
    class WaterOff implements Runnable{
        public void run(){
            System.out.println("Полив выключен!");
            water = false;
        }
    }
    class ThermostatNight implements Runnable {
        @Override
        public void run (){
            System.out.println("Включение дневного режима");
            setThermostat("Ночь");
        }
    }
    class ThermostatDay implements Runnable {
        @Override
        public void run (){
            System.out.println("Включение дневного режима");
            setThermostat("День");
        }
    }

    class Bell implements Runnable {
        @Override
        public void run(){
            System.out.println("Бам!!!!");
        }
    }

    class Terminate implements Runnable {
        @Override
        public void run() {
            System.out.println("the end");
            scheduler.shutdownNow();
           // new Thread(()->{for(DataPoint d :)});

        }
    }
    class Test {
        private final String user = null;

        public void setUser(){
           // user = new String("test");
        }
    }

}
