package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float side1, side2, side3;
		System.out.println("Type 3 sides of a triangle: ");
		side1 = scanner.nextFloat();
		side2 = scanner.nextFloat();
		side3 = scanner.nextFloat();
		if(side1 + side2>side3 || side1+side3>side2 || side2 + side3>side1) {
			if(side1 == side2 && side2 == side3 && side1 == side3) {
				System.out.println("EQUILATERAL TRIANGLE!");
			}else if(side1 != side2 && side2!=side3 && side3!=side1) {
				System.out.println("SCALENE TRIANGLE!");
			}else if(side1 == side2 || side2 == side3 || side3 == side1) {
				System.out.println("ISOSCELES TRIANGLE!");
			}
		}else {
			System.out.println("That's not a TRIANGLE!");
		}
		
		scanner.close();
	}

}
