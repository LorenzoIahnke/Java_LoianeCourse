package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[15];		
		int[] b = new int[a.length];
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("Enter a number for " + (i+1) +": ");
			a[i] = scanner.nextInt();
			b[i] = a[i] * a[i];
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
