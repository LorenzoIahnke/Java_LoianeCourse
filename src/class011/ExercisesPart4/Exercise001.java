package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];		
		int[] b = new int[a.length];
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("Enter a number for " + (i+1) +": ");
			a[i] = scanner.nextInt();
			b[i] = a[i];
		}
		System.out.println("Values of A: ");
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("Values of B: ");
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i] + " ");
		}
		scanner.close();
	}

}
