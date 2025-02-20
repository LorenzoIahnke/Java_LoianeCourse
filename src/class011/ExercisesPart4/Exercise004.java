package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[15];		
		double[] b = new double[a.length];
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("Enter a number for " + (i+1) +": ");
			a[i] = scanner.nextInt();
			b[i] = Math.sqrt(a[i]);
		}
		System.out.println("Values of A: ");
		for(int i = 0; i<a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println("\nValues of B: ");
		for(int i = 0; i<b.length; i++) {
			System.out.printf(b[i] + " ");
		}
		scanner.close();
	}

}
