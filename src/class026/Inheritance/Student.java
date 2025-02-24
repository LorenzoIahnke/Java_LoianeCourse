package class026.Inheritance;

public class Student extends Person{
	private String course;
	private double[] grades;

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

}
