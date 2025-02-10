package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise024 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int appleWeight, strawWeight;
		double applePrice = 0, strawPrice = 0, totalPrice, totalApple, totalStraw;
		System.out.println("Type the weight (kilos) you want of Apples: ");
		appleWeight = scanner.nextInt();
		System.out.println("Type the weight (kilos) you want of Strawberries: ");
		strawWeight = scanner.nextInt();
		
        if (appleWeight <= 5) {
            applePrice = 1.8;  
        } else {
            applePrice = 1.5; 
        }

        if (strawWeight <= 5) {
            strawPrice = 2.5;  
        } else {
            strawPrice = 2.2;  
        }

        
        totalApple = appleWeight * applePrice;
        totalStraw = strawWeight * strawPrice;
        totalPrice = totalApple + totalStraw;
        double realPrice = totalPrice;

       
        if ((appleWeight + strawWeight > 8) || totalPrice > 25) {
            realPrice = totalPrice - (totalPrice * 0.10);
        }

        System.out.println("Total: R$ " + realPrice);
        scanner.close();
	}

}
