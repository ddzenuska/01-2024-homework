package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class RegularHours {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 12, 1);
        LocalDate endDate = LocalDate.of(2024, 3, 19);

        System.out.print("Employee works " + calculateHours(startDate, endDate) + " regular office hours in the period " +
                startDate + " - " + endDate + ".");
    }

    public static Long calculateHours(LocalDate start, LocalDate end) {
        long hours = 0;
        
        for (LocalDate currDate = start; !currDate.isAfter(end); currDate = currDate.plusDays(1)) {
            if (currDate.getDayOfWeek().getValue() >= 1 && currDate.getDayOfWeek().getValue() <= 5) {
                hours += 8;
            }
        }
        return hours;
    }
}
