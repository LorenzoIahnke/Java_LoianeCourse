package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise028 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double price = 0;
		float newTotal = 0, total = 0;
		boolean isValid = true;
		do {
			System.out.println("Enter your product's price: ");
			price = scanner.nextDouble();
			total += price;
		} while (price != 0);
		System.out.printf("\nTotal: $%.2f \n", total);

		do {
			System.out.println("\nPay: \n");
			double pay = scanner.nextDouble();
			if (pay > total) {
				isValid = true;
				newTotal = (float) (pay - total);
				System.out.printf("\nChange: $%.2f \n", newTotal);
				System.out.println("\nThank you for your purchase! \n");
			} else if (pay < total) {
				isValid = false;
				System.out.println("\nInvalid, try again.");
			} else {
				isValid = true;
				System.out.println("\nThank you for your purchase!");
			}
		} while (!isValid);

		scanner.close();
	}

}
