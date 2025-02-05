package class004.Exercises;

import java.util.Scanner;

public class Exercise009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a, b, c;
		System.out.println("Type 3 numbers: ");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		System.out.println("Function 1: " + fun1(a, b));
		System.out.println("Function 2: " + fun2(a, c));
		System.out.println("Function 3: " + fun3(c));
		scanner.close();
	}
	public static float fun1(float a, float b) {
		return ((2*a)*(b/2));
	}
	
	public static float fun2(float a, float b) {
		return ((3*a)+b);
	}
	
	public static float fun3(float a) {
		return a*a*a;
	}
}
