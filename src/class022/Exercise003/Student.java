package class022.Exercise003;

public class Student {
	private String name, course, registration;
	private String[] subjects = new String[3];
	private double[][] grades = new double[3][4];
	private boolean approved = false;
	
	public Student() {}
	
	public Student(String name, String course, String registration, String[] subjects, double[][] grades,
			boolean approved) {
		super();
		this.name = name;
		this.course = course;
		this.registration = registration;
		this.subjects = subjects;
		this.grades = grades;
		this.approved = approved;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public double[][] getGrades() {
		return grades;
	}

	public void setGrades(double[][] grades) {
		this.grades = grades;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public void status() {
		System.out.println("Name: " + getName());
		System.out.println("Registration: " + getRegistration());
		System.out.println("Course: " + getCourse());
		
		for(int i = 0; i<grades.length; i++) {
			System.out.println("Subjects: " + subjects[i]);
			for(int j = 0; j<grades[i].length; j++) {
				System.out.print(grades[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public double getAverage(int index) {
		double sum = 0;
		for(int i = 0; i<grades[index].length; i++) {
			sum += grades[index][i];
		}
		double average = sum/4;
		return average;
	}
	
	public boolean valid(int index) {
		if(getAverage(index) >= 7) {
			return true;
		}
		return false;
	}
	
	public void setSubjectNamePos(int pos, String subjectName){
        this.subjects[pos] = subjectName;
    }
    
    public void setGradePosIJ(int posI, int posJ, double grade){
        this.grades[posI][posJ] = grade;
    }

	

}
