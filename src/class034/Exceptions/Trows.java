package class034.Exceptions;

import java.util.Scanner;

public class Trows {

	public static void main(String[] args) {
		System.out.println("Enter a decimal number: ");
		try {
			double num = readNumber();
			System.out.println("You entered " + num);
		} catch (Exception e) {
			System.out.println("Invalid input!");
			e.printStackTrace();
		}
	}
	
	public static double readNumber() throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {
			double num = scanner.nextDouble();
			return num;
		}

	}

}
