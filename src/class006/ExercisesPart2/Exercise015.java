package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise015 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean validDay = true;
		int day, month, year;
		System.out.println("Enter a day: ");
		day = scanner.nextInt();
		if(day<1 || day>31) {
			System.out.println("Invalid, days must be between 1 and 31");
			scanner.close();
			return;
		}
		System.out.println("Enter a month: ");		
		month = scanner.nextInt();
		if(month<1 || month>12) {
			System.out.println("Invalid, months must be between 1 and 12");
			scanner.close();
			return;
		}
		System.out.println("Enter a year: ");
		year = scanner.nextInt();
		if(year<1000) {
			System.out.println("Invalid, years must be above 1000");
			scanner.close();
			return;
		}
		
		switch(month) {
		case 2:
			if(isLeapYear(year)) {
				if(day>29) validDay = false;
			}else {
				if(day>28) validDay = false;
			}
			break;
		case 4: 
		case 6:
		case 9:
		case 11:
			if(day>30) validDay = false;
			break;
		default: 
			if(day>31) validDay = false;
			break;
		}
		
        if (!validDay) {
            System.out.println("Invalid day for the specified month.");
        } else {
            System.out.println("The entered date is valid.");
            System.out.printf("%d/%d/%d", day, month, year);
        }

        
		
		scanner.close();
	}

	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
	}
	
}
