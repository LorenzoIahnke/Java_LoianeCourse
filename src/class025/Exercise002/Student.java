package class025.Exercise002;

public class Student {
	private String name, registration;
	private double[] grades;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public double[] getGrades() {
		return grades;
	}
	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	
	public String obtainInfo() {
		String info = "\nName: " + name +
					"\nRegistration: " + registration + "\n";
		double sum = 0;
		for(double grade: grades) {
			sum+=grade;
			info+=grade;
		}
		double average = sum/4;
		info += "\n" + "Average: " + average + " - ";
		if(average>=7) {
			info += "Approved!";
		}else {
			info += "Failed!";
		}
		return info;
	}
	
	public double getAverage() {
		double sum = 0;
		for(double grade: grades) {
			sum+=grade;
		}
		return sum/4;
		
	}
}
