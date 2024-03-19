package io.codelex.dateandtime.practice;

import java.time.*;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    private void doDatesOverlap(DatePeriod secndPeriod) {
        if ((this.end.isBefore(secndPeriod.end) ? this.end : secndPeriod.end).isAfter
                (this.end.isBefore(secndPeriod.end) ? this.end : secndPeriod.end)) {
            System.out.print("Dates don't overlap each-other.");
        }
        System.out.print("Dates over-lap.");
    }

    DatePeriod intersection(DatePeriod secndPeriod) {
        LocalDate interStart = this.start.isAfter(secndPeriod.start) ? this.start : secndPeriod.start;
        LocalDate interEnd = this.end.isBefore(secndPeriod.end) ? this.end : secndPeriod.end;
        if (!interStart.isAfter(interEnd))
            return new DatePeriod(interStart, interEnd);
        else
            return null;
    }

    @Override
    public String toString() {
        return "Overlap {" +
                "start date: " + start +
                ", end date: " + end + "}";
    }
}