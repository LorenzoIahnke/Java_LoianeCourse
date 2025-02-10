package class005.Condicionals;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*int age;
		System.out.println("Type your age: ");
		age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("You're an adult");
		} else {
			System.err.println("You're not an adult yet");
		}*/
		// cheap <= 10
		// 10 < price < 15 - ask for discount
		// 15 <= price 17 - starting to get expensive
		// >= 17 - very expensive
		System.out.println("Type an item price: ");
		double price = scanner.nextDouble();
		if(price <= 10) {
			System.out.println("Cheap!");
		} else if(price > 10 && price < 15) {
			System.out.println("Not so cheap, ask for a discount");
		} else if(price > 15 && price < 17) {
			System.out.println("It starting to get expensive...");
		}else {
			System.out.println("Very expensive!!");
		}
			
		scanner.close();	
	}
	
	
}
