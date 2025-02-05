package class004.Exercises;

import java.util.Scanner;

public class Exercise010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float height;
		System.out.println("Type your height: ");
		height = scanner.nextFloat();
		System.out.println("Your ideal weight is: " + weight(height));
		scanner.close();
	}
	public static float weight(float height) {
		return ((72.7f * height) - 58);
	}
}
