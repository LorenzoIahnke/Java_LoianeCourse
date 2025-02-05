package class004.Exercises;

import java.util.Scanner;

public class Exercise005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a;
		System.out.println("Type a number in meters: ");
		a = scanner.nextFloat();
		System.out.printf("\n%.2f m in centimeters is: %.2f\n", a, convert(a));
		scanner.close();
	}
	
	public static float convert(float a) {
		return a*100;
	}
	
}
