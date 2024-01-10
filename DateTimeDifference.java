package com.datetime;
import java.time.Duration;
import java.time.LocalDateTime;
public class DateTimeDifference {
	private LocalDateTime firstDateTime;
    private LocalDateTime secondDateTime;

    public DateTimeDifference(LocalDateTime firstDateTime, LocalDateTime secondDateTime) {
        this.firstDateTime = firstDateTime;
        this.secondDateTime = secondDateTime;
    }

    public void printTimeDifferences() {
        Duration duration = Duration.between(firstDateTime, secondDateTime);
        
        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        long days = duration.toDays();
        long months = days / 30; // Assuming 30 days in a month
        long years = days / 365; // Assuming 365 days in a year
        
        System.out.println("Difference in minutes: " + minutes);
        System.out.println("Difference in hours: " + hours);
        System.out.println("Difference in days: " + days);
        System.out.println("Difference in months: " + months);
        System.out.println("Difference in years: " + years);
    }



}
