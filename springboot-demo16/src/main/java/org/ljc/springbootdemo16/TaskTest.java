package org.ljc.springbootdemo16;

import java.util.Timer;
import java.util.TimerTask;

public class TaskTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("打你一下");
            }
        };

        timer.schedule(timerTask,0,2000);
    }
}
