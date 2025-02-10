package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float hour, gross, ir, inss, fgts, discounts, net; 
		int month, irTax = 0;
		System.out.println("How much is your hour?: ");
		hour = scanner.nextFloat();
		System.out.println("How many hours do you work in a month?: ");
		month = scanner.nextInt();
		gross = hour*month;
		if(gross < 900) {
			irTax = 0;
		}else if(gross >=900 && gross<1500) {
			irTax = 5;
		}else if(gross >=1500 && gross<2500) {
			irTax = 10;
		}else if(gross >= 2500) {
			irTax = 20;
		}
		ir = (gross*irTax)/100;
		inss = (gross*10)/100;
		fgts = (gross*11)/100;
		discounts = ir + inss;
		net = gross - discounts;
		System.out.println("Gross: $" + gross);
		System.out.println("IR: $" + ir);
		System.out.println("INSS: $" + inss);
		System.out.println("FGTS: $" +  fgts);
		System.out.println("Discounts: $" + discounts);
		System.out.println("Net: $" + net);
		scanner.close();
	}

}
