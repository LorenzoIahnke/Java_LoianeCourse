package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Type a Number: ");
		number = scanner.nextInt();
		if(number%2 == 0) {
			System.out.println("Even!");
		}else {
			System.out.println("Odd!");
		}
		
		scanner.close();
	}

}
