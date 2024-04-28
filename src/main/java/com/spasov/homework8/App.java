package com.spasov.homework8;

import com.spasov.homework8.config.SpringConfig;
import com.spasov.homework8.entity.EnDayOfWeek;
import com.spasov.homework8.entity.ItDayOfWeek;
import com.spasov.homework8.service.CurrentDayOfWeekService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CurrentDayOfWeekService currentDayOfWeekService = context.getBean("currentDayOfWeekService", CurrentDayOfWeekService.class);
        CurrentDayOfWeekService currentDayOfWeekService2 = context.getBean("currentDayOfWeekService", CurrentDayOfWeekService.class);
        System.out.println("1: " +currentDayOfWeekService.displayCurrentDayOfWeek());
        ItDayOfWeek itDayOfWeek = context.getBean("itDayOfWeek", ItDayOfWeek.class);
        currentDayOfWeekService.setCurrentDayOfWeek(itDayOfWeek);
        System.out.println("1: " +currentDayOfWeekService.displayCurrentDayOfWeek());
        System.out.println("2: " + currentDayOfWeekService2.displayCurrentDayOfWeek());

    }
}
