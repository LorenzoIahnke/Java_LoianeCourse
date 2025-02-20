package class009.BreakContinue;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a number: ");
//		int num = scanner.nextInt();
//		System.out.println("Enter a limit: ");
//		int max = scanner.nextInt();
//		
//		for(int i = num; i<=max; i++) {
//			System.out.println(i);
//			if(i%7 == 0) {
//				System.out.println("I equals: " + i);
//				break;
//			}
//		}
		
//		for(int i = 0; i<=4; i++) {
//			label1:{
//				label2:{
//					label3:{
//						if(i==1) {
//							break label1;
//						}
//						if(i==2) {
//							break label2;
//						}
//						if(i==3) {
//							break label3;
//						}
//						System.out.println("Label 3:");
//					}
//					System.out.println("Label 2");
//				}
//				System.out.println("Label 3");
//			}
//			System.out.println(i);
//		}

		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		System.out.println("Enter a limit: ");
		int max = scanner.nextInt();
		
		for(int i = num; i<=max; i++) {
			if(i%7 == 0) {
				continue;
			}
			System.out.println("I equals: " + i);

		}

		
		scanner.close();
	}

}
