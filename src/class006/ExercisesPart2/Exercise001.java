package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		System.out.println("Type two numbers: ");
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		if(number1 > number2) {
			System.out.printf("Number %d is greater than %d", number1, number2);
		} else if(number1 == number2) {
			System.out.printf("Number %d equals %d", number1, number2);
		} else if (number1 < number2) {
			System.out.printf("Number %d is smaller than %d", number1, number2);
		}
		
		scanner.close();
	}

}
