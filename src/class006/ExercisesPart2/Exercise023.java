package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise023 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fuel;
		double liters, discountPrice = 0, priceG = 2.5, priceD = 1.9, total = 0, discountTotal = 0, realTotal;
		System.out.println("Type the type of fuel you are using G(Gasoline)/D(Diesel): ");
		fuel = scanner.nextLine();
		System.out.println("Type the amount of liters you are using: ");
		liters = scanner.nextDouble();
		if(fuel.equalsIgnoreCase("G")) {
			if(liters>20) {
				discountPrice = 5;
			}else {
				discountPrice = 3;
			}
			total = liters*priceG;
		}else if(fuel.equalsIgnoreCase("D")) {
			if(liters>20) {
				discountPrice = 6;
			}else {
				discountPrice = 4;
			}
			total = liters*priceD;
		}
		discountTotal = total * (discountPrice/100);
		realTotal = total - discountTotal;
		System.out.println("Total: $" + total);
		System.out.println("Discounts: $" + discountTotal);
		System.out.println("Total with Discounts: $" + realTotal);
		scanner.close();
	}

}
