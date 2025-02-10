package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a year: ");
		int year = scanner.nextInt();
		if (year < 1000 || year > 9999) {
			System.out.println("Invalid, the interval must be between 1000 and 9999");
		} else {

			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.printf("%d is a Leap Year", year);
			} else {
				System.out.printf("%d is NOT a Leap Year", year);
			}
		}

		scanner.close();
	}

}
