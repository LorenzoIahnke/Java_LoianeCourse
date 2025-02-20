package class018.Exercise003;

public class Student {
	String name, course, registration;
	String[] subjects = new String[3];
	double[][] grades = new double[3][4];
	boolean approved = false;
	
	void status() {
		System.out.println("Name: " + name);
		System.out.println("Registration: " + registration);
		System.out.println("Course: " + course);
		
		for(int i = 0; i<grades.length; i++) {
			System.out.println("Subjects: " + subjects[i]);
			for(int j = 0; j<grades[i].length; j++) {
				System.out.print(grades[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	double getAverage(int index) {
		double sum = 0;
		for(int i = 0; i<grades[index].length; i++) {
			sum += grades[index][i];
		}
		double average = sum/4;
		return average;
	}
	
	boolean valid(int index) {
		if(getAverage(index) >= 7) {
			return true;
		}
		return false;
	}
}
