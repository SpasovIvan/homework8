package com.spasov.homework8.service;

import com.spasov.homework8.entity.CurrentDayOfWeek;

public class CurrentDayOfWeekService {
    private CurrentDayOfWeek currentDayOfWeek;

    public CurrentDayOfWeekService(CurrentDayOfWeek currentDayOfWeek) {
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
