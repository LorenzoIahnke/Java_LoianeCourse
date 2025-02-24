package class030.ObjectClass;

import java.util.Arrays;
import java.util.Objects;

public class Student{
	private String course;
	private double[] grades;
	
	public void verifyAccess() {
		//super.nameVisible = "Maria";
	}
	
	public Student() {
		super();
	}
	
	public Student(String name, String address, String phone, String course) {
		//super(name, address, phone);
		this.course = course;
	}


	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public double calculateAverage() {

		return 0;
	}

	public boolean validApproved() {
		return true;
	}

	public void anything() {
		//super.setCPF("45452452452");
		//this.setCPF("5425245252");
	}
	
	public String getAddressMethod() {
		String s = "Student Address: ";
		//s+=this.getAddress();
		return s;
	}
	
	public void showAddressMethod() {
		System.out.println(this.getAddressMethod());
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", grades=" + Arrays.toString(grades) + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && Arrays.equals(grades, other.grades);
	}
	
	/*public String toString() {
		String s = course + "\n";
		for(double grade: grades) {
			s += grade + " ";
		}
		return s;
	}*/
	
	
	
}
