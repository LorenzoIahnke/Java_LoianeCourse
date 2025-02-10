package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise021 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2, result = 0;
		boolean valid = true;
		System.out.println("Type two numbers: ");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		System.out.println("Choose an operation (+ - * /): ");
		char operation = scanner.next().charAt(0);
		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid!");
			valid = false;
			break;
		}

		if (valid) {
			System.out.println("Result: " + result);
			if (result > 0) {
				System.out.println("Is a positive number!");
			} else {
				System.out.println("Is a negative number!");
			}
			if (result % 2 == 0) {
				System.out.println("It's an Even number!");
			} else {
				System.out.println("It's an Odd number!");
			}
			if (result == Math.round(result)) {
				System.out.println("It's an int number!");
			} else {
				System.out.println("It's a decimal number!");
			}
		}else {
			System.out.println("Invalid! Invalid! Invalid!");
		}
		scanner.close();
	}

}
