package class004.Exercises;

import java.util.Scanner;

public class Exercise012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float price, newPrice;
		System.out.println("Type the weight of your product: ");
		price = scanner.nextFloat();
		
		if(price>50) {
			newPrice = price + (price - 50) * 4;
			System.out.println("Your product has been taxed due to the bigger weight, now you have to pay: $" + newPrice);
		}else if(price <= 50) {
			System.out.println("Your product has not been taxed, good job!");
		}else {
			System.out.println("Invalid!");
		}
		scanner.close();
	}

}
