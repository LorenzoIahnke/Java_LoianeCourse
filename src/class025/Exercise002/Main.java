package class025.Exercise002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Course Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Course Time: ");
		String time = scanner.nextLine();
		
		Course c = new Course();
		c.setName(name);
		c.setTime(time);
		
		System.out.println("Enter Teacher's Name: ");
		String teacherName = scanner.nextLine();
		System.out.println("Enter Teacher's Department: ");
		String department = scanner.nextLine();
		System.out.println("Enter Teacher's Email: ");
		String email = scanner.nextLine();
		
		Teacher t = new Teacher();
		t.setName(teacherName);
		t.setDepartment(department);
		t.setEmail(email);
		
		c.setTeacher(t);
		
		System.out.println("---Students---");
		Student[] student = new Student[2];
		for(int i = 0; i<student.length; i++) {
				scanner.nextLine();
				
			System.out.println("Enter Name Student " + (i+1) + ": ");
			String studentName = scanner.nextLine();
			System.out.println("Enter Registration Student " + (i+1) + ": ");
			String registration = scanner.nextLine();
			
			double[] grades = new double[4];
			for(int j = 0; j<grades.length; j++) {
				System.out.println("Enter Grade " + (j+1) + ": ");
				grades[j] = scanner.nextDouble();
			}
				
			Student students = new Student();
			students.setName(studentName);
			students.setRegistration(registration);
			students.setGrades(grades);
			student[i] = students;
		}
		
		c.setStudents(student);
		System.out.println(c.obtainInfo());
		
		scanner.close();
	}

}
