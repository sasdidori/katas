package me.dora.katas.kyu8and7.period;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class TrackingPeriod {
    public boolean isPeriodLate(LocalDate last, LocalDate today, int cycleLength) {
        long until = last.until(today, ChronoUnit.DAYS);
        int daysSinceLast = Long.valueOf(until).intValue();
        return daysSinceLast > cycleLength;
    }
}
