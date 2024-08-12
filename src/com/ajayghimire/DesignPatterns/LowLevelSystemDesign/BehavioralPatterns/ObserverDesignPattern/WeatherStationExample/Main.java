package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.WeatherStationExample;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  public static void main(String[] args) {
    WeatherStationObservableImp weatherStationObserver = new WeatherStationObservableImp();
    weatherStationObserver.setTemperature(95);
    System.out.println(weatherStationObserver.getTemperature());
    DisplayObservable tv = new TVDisplayObserver(weatherStationObserver, "TV");
    DisplayObservable mobile = new MobileDisplayObserver(weatherStationObserver, "Mobile");

    weatherStationObserver.add(tv);
    weatherStationObserver.add(mobile);

    AtomicInteger executionCounter = new AtomicInteger(0);
    Random random = new Random();


    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    Thread thread =
        new Thread(
            () -> {
              int randomTemp = 80 + random.nextInt(21);
              System.out.println("Generated Temperature: " + randomTemp);
              weatherStationObserver.setNewTemperature(randomTemp);

              executionCounter.incrementAndGet();

              if (executionCounter.get() >= 10) {
                scheduler.shutdown();
              }
            });
    scheduler.scheduleAtFixedRate(thread, 0, 2, TimeUnit.SECONDS);
    try {
      scheduler.awaitTermination(10, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
