package class004.Exercises;

import java.util.Scanner;

public class Exercise007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a;
		System.out.println("Type a side of the square: ");
		a = scanner.nextFloat();
		System.out.println("The area of the square is: " + area(a));
		System.out.println("The doubled value of it is: " + 2*area(a));
		scanner.close();
	}
	
	public static float area(float a) {
		return a*a;
	}
	
}
