package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number;
		System.out.println("Type a number: ");
		number = scanner.nextDouble();
		if(number == Math.round(number)) {
			System.out.println("It's a int number!");
		}else {
			System.out.println("It's a decimal number!");
		}
		
		scanner.close();
	}

}
