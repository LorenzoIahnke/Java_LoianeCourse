package class004.Exercises;

import java.util.Scanner;

public class Exercise006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a;
		System.out.println("Type a Radius of a circle: ");
		a = scanner.nextFloat();
		System.out.println("The area of the circle is: " + radius(a));
		scanner.close();
	}
	
	public static float radius(float a) {
		return a*a*3.14f;
	}
}
