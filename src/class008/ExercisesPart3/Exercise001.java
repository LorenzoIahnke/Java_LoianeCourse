package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.println("Type a number between 1 - 10");
			number = scanner.nextInt();
		} while (number < 1 || number > 10);

		System.out.println("Great, you chose: " + number);
		scanner.close();
	}

}
