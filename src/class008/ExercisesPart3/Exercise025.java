package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise025 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = 0, b = 0, k = 0;
		System.out.println("Enter the number of electors: ");
		int num = scanner.nextInt();

		scanner.nextLine();

		for (int i = 0; i < num; i++) {
			System.out.println("Who are voting for (T for Trump, B for Biden and K for Kamala): ");
			String choice = scanner.nextLine();
			switch (choice.toLowerCase()) {
			case "t":
				t++;
				break;
			case "b":
				b++;
				break;
			case "k":
				k++;
				break;
			default:
				System.out.println("Invalid!");
				break;
			}

		}
		System.out.println("Total: ");
		System.out.println("Trump: " + t);
		System.out.println("Biden: " + b);
		System.out.println("Kamala: " + k);
		
		if(t>b && t>k){
			System.out.println("Trump WINS!");
		}else if(b>t && b>k){
			System.out.println("Biden WINS!");
		}else if(k>t && k>b) {
			System.out.println("Kamala WINS!");
		}else {
			System.out.println("It's a TIE!");
		}
		scanner.close();
	}

}
