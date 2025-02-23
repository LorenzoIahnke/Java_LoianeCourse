package class022.Exercise003;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter your name: ");
		s1.setName(scanner.next()); 
		System.out.println("Enter your registration: ");
		s1.setRegistration(scanner.next());
		System.out.println("Enter your course: ");
		s1.setCourse(scanner.next());
		
		for(int i = 0; i<s1.getSubjects().length; i++) {
			System.out.println("Enter your subjects: ");
			s1.setSubjectNamePos(i, scanner.next());
		}
		
		for(int i = 0; i<s1.getGrades().length; i++) {
			System.out.println("Obtaining grades from subject " + s1.getSubjects()[i]);
			for(int j = 0; j<s1.getGrades()[i].length; j++) {
				System.out.println("Enter your grade " + (j+1) + ": ");
				s1.setGradePosIJ(i, j, scanner.nextDouble());
			}
		}
		s1.status();
		
		for(int i = 0; i<s1.getSubjects().length; i++) {
			if(s1.valid(i)) {
				System.out.println("Subject " + s1.getSubjects()[i] + " - APPROVED!");
			}else {
				System.out.println("Subject " + s1.getSubjects()[i] + " - NOT APPROVED!");
			}
		}
		
		scanner.close();
	}

}
