package class022.Exercise002;

import java.util.Scanner;

public class MainCheckingAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CheckingAccount c1 = new CheckingAccount("143141", "Nubank");

		System.out.println("Account: " + c1.getNumber() + ", Agency: " + c1.getAgency());
		System.out.println("How much you want to deposit?: ");
		float depositAmount = scanner.nextFloat();
		c1.deposit(depositAmount);
		c1.showBalance();

		float withdrawAmount;
		do {
			System.out.println("How much you want to withdraw?: ");
			withdrawAmount = scanner.nextFloat();
			c1.withdraw(withdrawAmount);
			if (withdrawAmount > c1.getBalance()) {
				System.out.println("Try again.");
			}
		} while (withdrawAmount > c1.getBalance());
		c1.showBalance();

		scanner.close();

	}

}
