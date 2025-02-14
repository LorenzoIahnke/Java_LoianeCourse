package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number of how many times you want to calculate the factorial: ");
		int n = scanner.nextInt();
		for (int j = 1; j <= n; j++) {
			System.out.println("Enter a number: ");
			int num = scanner.nextInt();
			if (num < 16) {
				int factorial = factorial(num);
				System.out.println("Factorial of " + num + ", is " + factorial);
			} else {
				System.out.println("Invalid, value must be less than 16!");
			}
		}
		scanner.close();

	}

	public static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;

	}

}
