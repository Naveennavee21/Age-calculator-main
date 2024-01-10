package com.datetime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateTimeDifferenceCalculator {

	public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
    
    DateTimeInputHandler inputHandler = new DateTimeInputHandler(scanner);
    LocalDateTime firstDateTime = inputHandler.getDateTimeFromUser("Enter the first date and time (yyyy-MM-dd HH:mm:ss): ");
    LocalDateTime secondDateTime = inputHandler.getDateTimeFromUser("Enter the second date and time (yyyy-MM-dd HH:mm:ss): ");
    
    DateTimeDifference difference = new DateTimeDifference(firstDateTime, secondDateTime);
    difference.printTimeDifferences();
    
    scanner.close();
}
	

	}


