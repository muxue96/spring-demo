package org.ljc.springbootdemo16.config;

import org.ljc.springbootdemo16.auartz.MyQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail printJobDetail(){
        return JobBuilder.newJob(MyQuartz.class).storeDurably().build();
    }

    @Bean
    public Trigger printJobTrigger(){
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(printJobDetail()).withSchedule(cronScheduleBuilder).build();
    }

}
