package com.spasov.homework8.service;

import com.spasov.homework8.entity.CurrentDayOfWeek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("currentDayOfWeekService")
@Scope("prototype")
public class CurrentDayOfWeekService {
    private CurrentDayOfWeek currentDayOfWeek;

    @Autowired
    public CurrentDayOfWeekService(@Qualifier("enDayOfWeek") CurrentDayOfWeek currentDayOfWeek) {
        this.currentDayOfWeek = currentDayOfWeek;
    }

    public CurrentDayOfWeek getCurrentDayOfWeek() {
        return currentDayOfWeek;
    }

    public void setCurrentDayOfWeek(CurrentDayOfWeek currentDayOfWeek) {
        this.currentDayOfWeek = currentDayOfWeek;
    }

    public String displayCurrentDayOfWeek() {
        return currentDayOfWeek.getCurrentDayOfWeek();
    }

}
