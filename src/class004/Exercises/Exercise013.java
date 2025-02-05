package class004.Exercises;

import java.util.Scanner;

public class Exercise013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float hour, month, gross, inss, tax, sindicate, net, discounts;
		System.out.println("Type how much do you earn in an hour: ");
		hour = scanner.nextFloat();
		System.out.println("Type how many hours do you work in a month: ");
		month = scanner.nextFloat();
		gross = hour*month;
		inss = (8*gross)/100;
		tax = (11*gross)/100;
		sindicate = (5*gross)/100;
		discounts = inss + tax + sindicate;
		net = gross - discounts;
		System.out.println("Here are some informations about your salary:");
		System.out.println("Gross Salary: $" + gross);
		System.out.println("INSS tax: $" + inss);
		System.out.println("Tax: $" + tax);
		System.out.println("Sindicate tax: $" + sindicate);
		System.out.println("Total discounts: $" + discounts);
		System.out.println("Net Salary: $" + net);
		
		scanner.close();
	}

}