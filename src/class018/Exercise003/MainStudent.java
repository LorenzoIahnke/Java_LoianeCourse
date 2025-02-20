package class018.Exercise003;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter your name: ");
		s1.name = scanner.next();
		System.out.println("Enter your registration: ");
		s1.registration = scanner.next();
		System.out.println("Enter your course: ");
		s1.course = scanner.next();
		
		for(int i = 0; i<s1.subjects.length; i++) {
			System.out.println("Enter your subjects: ");
			s1.subjects[i] = scanner.next();
		}
		
		for(int i = 0; i<s1.grades.length; i++) {
			System.out.println("Obtaining grades from subject " + s1.subjects[i]);
			for(int j = 0; j<s1.grades[i].length; j++) {
				System.out.println("Enter your grade " + (j+1) + ": ");
				s1.grades[i][j] = scanner.nextDouble();
			}
		}
		s1.status();
		
		for(int i = 0; i<s1.subjects.length; i++) {
			if(s1.valid(i)) {
				System.out.println("Subject " + s1.subjects[i] + " - APPROVED!");
			}else {
				System.out.println("Subject " + s1.subjects[i] + " - NOT APPROVED!");
			}
		}
		
		scanner.close();
	}

}
