package com.haut.promotion.conf;

import com.haut.promotion.quartz.testQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail testJobDetail(){
        //withIdentity定义 TriggerKey,也可以不设置，会⾃动⽣成⼀个独⼀⽆⼆的 TriggerKey ⽤来区分不同的 Trigger
        //usingJobData("name", "World定时器") 设置SampleJob属性对应的值
        return JobBuilder.newJob(testQuartz.class).withIdentity("testQuartz")
                .usingJobData("name","233").storeDurably().build();
    }
    @Bean
    public Trigger testJobTrigger(){
        //withIntervalInSeconds(10)每隔10秒钟执行一次
        SimpleScheduleBuilder simpleScheduleBuilder =
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();
        return TriggerBuilder.newTrigger().forJob(testJobDetail())
                .withIdentity("testTrigger").withSchedule(simpleScheduleBuilder).build();
    }
}
