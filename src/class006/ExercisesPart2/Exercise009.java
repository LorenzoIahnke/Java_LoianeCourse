package class006.ExercisesPart2;

import java.util.Scanner;

public class Exercise009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float salary, newSalary = 0, salaryValue = 0, raising = 0;
		System.out.println("Type your salary: ");
		salary = scanner.nextFloat();
		if(salary <=280) {
			raising = 20;
		}else if(salary >280 && salary <700) {
			raising = 15;
		}else if(salary >= 700 && salary<1500) {
			raising = 10;
		}else if(salary>=1500) {
			raising = 5;
		}
		salaryValue = (salary*raising)/100;
		newSalary = salary + salaryValue;
		System.out.println("Salary: $" + salary);
		System.out.println("Raising: %" + raising);
		System.out.println("Salary Value: $" + salaryValue);
		System.out.println("New Salary: $" + newSalary);
		scanner.close();
	}

}
