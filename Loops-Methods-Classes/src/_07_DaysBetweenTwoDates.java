
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String start = sc.nextLine();
		String end = sc.nextLine();
		
		LocalDate startDate = LocalDate.parse(start, DateTimeFormatter.ofPattern("d-MM-yyyy"));
		LocalDate endDate = LocalDate.parse(end, DateTimeFormatter.ofPattern("d-MM-yyyy"));
		
		System.out.println(ChronoUnit.DAYS.between(startDate, endDate));
	}
}


//SECOND WAY
//System.out.print("Enter start date: ");
//String[] firstInput = input.nextLine().split("-");
//System.out.print("Enter end date: ");
//String[] secondInput = input.nextLine().split("-");
//
////creates new dates from the split Strings entered from the console in format "yyyy-MM-dd HH:mm"
//LocalDateTime firstDate = LocalDateTime.of(Integer.parseInt(firstInput[2]), Integer.parseInt(firstInput[1]), Integer.parseInt(firstInput[0]), 00, 00);
//LocalDateTime secondDate = LocalDateTime.of(Integer.parseInt(secondInput[2]), Integer.parseInt(secondInput[1]), Integer.parseInt(secondInput[0]), 00, 00);
//
//Duration daysBetween = Duration.between(firstDate, secondDate);
//System.out.println("Days between the dates: " + daysBetween.toDays());