package academy.devdojo.javaoneforall.javacore.ZZGconcurrency.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private final static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalDateTime.now().format(pattern) + " beep");
            try {
                TimeUnit.SECONDS.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

//        executorService.schedule(r, 5, TimeUnit.SECONDS); -> execute after 5 seconds

//        ScheduledFuture<?> scheduledFuture = executorService.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);// with a fixed delay (count from when the thread wakes up)
        ScheduledFuture<?> scheduledFuture = executorService.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);// executed always in that delay (count fixed time)
        executorService.schedule(() -> {
            System.out.println(LocalDateTime.now().format(pattern) + " cancelling scheduleWithFixedTimeDelay");
            scheduledFuture.cancel(false);
            executorService.shutdown();
        }, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(pattern));
        beeper();
    }
}
