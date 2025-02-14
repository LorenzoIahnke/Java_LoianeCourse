package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int greatest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		int sum = 0;
		int num;
		System.out.println("Enter a number for the 'N' interval: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {

			System.out.println("Enter number " + i + ": ");
			num = scanner.nextInt();
			if (num > 0 && num < 1000) {

				sum += num;
				if (num > greatest) {
					greatest = num;
				}
				if (num < lowest) {
					lowest = num;
				}
			} else {
				System.out.println("Invalid number, please enter a number between 1 and 999.");
				i--; 
			}
		}
		System.out.println("The smallest number is: " + lowest);
		System.out.println("The largest number is: " + greatest);
		System.out.println("The sum of the numbers is: " + sum);

		scanner.close();

	}

}
