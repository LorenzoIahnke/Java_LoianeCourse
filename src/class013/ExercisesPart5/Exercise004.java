package class013.ExercisesPart5;

import java.util.Scanner;

public class Exercise004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[][] tasks = new String[31][24];
		boolean leave = false;
		byte option;
		while (!leave) {
			System.out.println("1 - Schedule a task");
			System.out.println("2 - Show tasks");
			System.out.println("0 - Leave");
			option = scanner.nextByte();

			if (option == 1) {
				boolean validDay = false;
				int day = 0;
				while (!validDay) {
					System.out.println("Enter a day of the month: ");
					day = scanner.nextInt();
					if (day > 0 && day <= 31) {
						validDay = true;
					} else {
						System.out.println("Invalid day, try again: ");
					}
				}

				boolean validHour = false;
				int hour = 0;
				while (!validHour) {
					System.out.println("Enter the time: ");
					hour = scanner.nextInt();
					if (hour > 0 && hour <= 24) {
						validHour = true;
					} else {
						System.out.println("Invalid hour, try again: ");
					}
				}

				day--;
				System.out.println("Enter the schedule: ");
				tasks[day][hour] = scanner.next();
			} else if (option == 2) {
				boolean validDay = false;
				int day = 0;
				while (!validDay) {
					System.out.println("Enter a day of the month: ");
					day = scanner.nextInt();
					if (day > 0 && day <= 31) {
						validDay = true;
					} else {
						System.out.println("Invalid day, try again: ");
					}
				}

				boolean validHour = false;
				int hour = 0;
				while (!validHour) {
					System.out.println("Enter the time: ");
					hour = scanner.nextInt();
					if (hour > 0 && hour <= 24) {
						validHour = true;
					} else {
						System.out.println("Invalid hour, try again: ");
					}
				}

				day--;
				System.out.println("Task schedule is: ");
				System.out.println(tasks[day][hour]);
			} else if (option == 0) {
				System.out.println("See you soon!");
				leave = true;
			} else {
				System.out.println("Invalid option!");
			}

		}
		scanner.close();
	}

}
