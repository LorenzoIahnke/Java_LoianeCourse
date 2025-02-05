package class004.Exercises;

import java.util.Scanner;

public class Exercise002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number: ");
		int number = scanner.nextInt();
		System.out.println("Your number was: " + number);
		
		scanner.close();
	}

}
