package class025.Exercise002;

public class Course {
	private String name, time;
	private Teacher teacher;
	private Student[] students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String obtainInfo() {
		String info = "Course: " + name + "\nTime: " + time;
		if (teacher != null) {
			info += teacher.obtainInfo();
		}

		if (students != null) {
			System.out.println("---Students---");

			for (Student student : students) {
				if (student != null) {
					info += student.obtainInfo();
					info += "\n";
				}
			}
			info += "Class Average: " + getClassAverage();

		}

		return info;
	}

	public double getClassAverage() {
		double sum = 0;
		for (Student student : students) {
			if (student != null) {
				sum += student.getAverage();
			}
		}
		return sum / students.length;
	}

}
