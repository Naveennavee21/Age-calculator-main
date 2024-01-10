package com.datetime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeInputHandler {
	private Scanner scanner;

    public DateTimeInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public LocalDateTime getDateTimeFromUser(String message) {
        System.out.println(message);
        String dateTimeStr = scanner.nextLine();
        return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
