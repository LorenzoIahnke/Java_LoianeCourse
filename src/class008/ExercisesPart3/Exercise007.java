package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int greatest = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a number: ");
			number = scanner.nextInt();
			if (number > greatest) {
				greatest = number;
			}

		}

		System.out.println("The greatest number was: " + greatest);
		scanner.close();
	}

}
