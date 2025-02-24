package class028.AbstractClass;

public class Teacher extends Person {
	private String courseName;
	private double salary;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculateSalary() {
		return 0;
	}
	
	public String getAddressMethod() {
		String s = "Teacher Address: ";
		s+=this.getAddress();
		return s;
	}


	public void showAddressMethod() {
		System.out.print("Showing Teacher's Address: ");
		System.out.print(this.getAddressMethod());
	}
}
