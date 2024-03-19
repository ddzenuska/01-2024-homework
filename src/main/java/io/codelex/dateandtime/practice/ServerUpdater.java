package io.codelex.dateandtime.practice;

import java.time.*;

public class ServerUpdater {
    public static void main(String[] args) {
        LocalDate serverLaunch = LocalDate.of(2024, 3, 10);
        whenToUpdate(serverLaunch);
    }

    public static void whenToUpdate(LocalDate launched) {
        LocalDate currDate = launched.plusDays(14);
        
        while (currDate.getMonth() == launched.getMonth()) {
            System.out.print("Update server on: " + currDate);
            currDate = currDate.plusDays(14);
        }
    }
}
