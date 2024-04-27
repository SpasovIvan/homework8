package com.spasov.homework8;

import com.spasov.homework8.entity.EnDayOfWeek;
import com.spasov.homework8.service.CurrentDayOfWeekService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CurrentDayOfWeekService currentDayOfWeekService = context.getBean("currentDayOfWeekService", CurrentDayOfWeekService.class);
        System.out.println(currentDayOfWeekService.displayCurrentDayOfWeek());
    }
}
