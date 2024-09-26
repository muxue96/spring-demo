package org.ljc.springbootdemo16.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTask {

    @Scheduled(cron = "0/1 * * * * *")
    public void taskPrint(){
        System.out.println(Thread.currentThread().getName()+"这是我的定时任务 task");
    }
}
