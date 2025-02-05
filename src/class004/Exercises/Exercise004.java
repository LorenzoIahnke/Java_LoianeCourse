package class004.Exercises;

import java.util.Scanner;

public class Exercise004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a, b, c, d;
		System.out.println("Enter your 4 grades: ");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		d = scanner.nextFloat();
		System.out.println("Your average is: " + average(a, b, c, d));
		scanner.close();
	}
	
	public static float average(float a, float b, float c, float d) {
		return (a+b+c+d)/4;
	}
	
}
