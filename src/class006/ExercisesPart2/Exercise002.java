package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Type a number: ");
		number = scanner.nextInt();
		if(number>=0) {
			System.out.println("Your number is positive");
		}else if(number < 0) {
			System.out.println("Your number is negative");
		}
		
		scanner.close();
	}

}
