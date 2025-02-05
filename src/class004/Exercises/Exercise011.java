package class004.Exercises;

import java.util.Scanner;

public class Exercise011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float height, weight, idealWeight = 0;
		String sex;
		System.out.println("Type your height: ");
		height = scanner.nextFloat();
		System.out.println("Type your sex (M for Men || W for Woman): ");
		sex = scanner.next();
		System.out.println("Type your weight: ");
		weight = scanner.nextFloat();
		
        if(sex.equalsIgnoreCase("M")) {
            idealWeight = (72.7f * height) - 58;
        } else if(sex.equalsIgnoreCase("W")) {
            idealWeight = (62.1f * height) - 44.7f;
        } else {
            System.out.println("Invalid!");
            return;
        }
		
		System.out.println("The ideal weight for you is: " + idealWeight);
		if(idealWeight < weight) {
			System.out.println("Overweight");
		}else if(idealWeight == weight) {
			System.out.println("Ideal Weight!");
		}else if (idealWeight > weight) {
			System.out.println("Underweight");
		}

	}
	
}
