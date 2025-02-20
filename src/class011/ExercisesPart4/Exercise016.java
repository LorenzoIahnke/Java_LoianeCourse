package class011.ExercisesPart4;

import java.util.Scanner;

public class Exercise016 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] a = new double[10];
		double smallest = Double.MAX_VALUE;
		double greatest = Double.MIN_VALUE;
        int smallestIndex = -1;
        int greatestIndex = -1;

		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter someone's age: ");
			a[i] = scanner.nextDouble();
			if(a[i] > greatest) {
				greatest = a[i];
				greatestIndex = i;
			}else if(a[i] < smallest) {
				smallest = a[i];
				smallestIndex = i; 
			}
			
		}

		System.out.println("Values of A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
		
        System.out.println("\n\nSmallest age: " + smallest + ", found at position " + (smallestIndex + 1));
        System.out.println("Greatest age: " + greatest + ", found at position " + (greatestIndex + 1));

		scanner.close();


	}

}
