package class004.Exercises;

import java.util.Scanner;

public class Exercise008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a;
		System.out.println("Type a temperature value in Fahrenheit: ");
		a = scanner.nextFloat();
		System.out.println("In Celsius your temperature is: " + convert(a));
		scanner.close();
	}
	public static float convert(float a) {
		return (5*(a-32)/9);
	}
	
}
