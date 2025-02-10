package class005.Condicionals;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		System.out.println("Type a day of the week (1 - 7): ");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wendseday");
			break;
		case 5:
			System.out.println("Thurday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid!");
			break;
		}

		scanner.close();
	}

}
