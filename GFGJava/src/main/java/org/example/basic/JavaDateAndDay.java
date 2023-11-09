package org.example.basic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaDateAndDay {
    public static void main(String[] args) {
        int Date = 17,
        Month = 03 - 1,
        Year = 2017;
        System.out.println(findDay(Date, Month, Year));
    }

    static String findDay(int Day, int Month, int Year) {
        return java.time.LocalDate.of(Year, Month, Day).getDayOfWeek().name();
    }
}

