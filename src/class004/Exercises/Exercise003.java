package class004.Exercises;

import java.util.Scanner;

public class Exercise003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number: ");
		int a = scanner.nextInt();
		System.out.println("Type another number: ");
		int b = scanner.nextInt();
		System.out.println("Sum of your numbers = " + sum(a, b));
		scanner.close();
	}

	public static int sum(int a, int b) {
		return a+b;
	}
}
