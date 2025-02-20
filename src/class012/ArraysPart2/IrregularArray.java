package class012.ArraysPart2;

import java.util.Scanner;

public class IrregularArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of people that will be interviewed: ");
		int numInterviewed = scanner.nextInt();
		
		String[][] childrenName = new String[numInterviewed][];
		for(int i = 0; i<childrenName.length; i++) {
			System.out.println("Enter the amount of children you have: ");
			int amountChildren = scanner.nextInt();
			
			childrenName[i] = new String[amountChildren];
			
			for(int j = 0; j<childrenName[i].length; j++) {
				System.out.println("Enter the name of the Child " + (j+1) + ": ");
				childrenName[i][j] = scanner.next();
			}
				
		}
		
		for(int i = 0; i<childrenName.length; i++) {
			System.out.println("\nPerson " + (i+1) + " has " + childrenName[i].length + " children.");
			for(int j = 0; j<childrenName[i].length; j++) {
				System.out.print(childrenName[i][j] + " ");
			}
		}
		
		
		scanner.close();
	}

}
