package class025.Exercise002;

public class Teacher {
	private String name, email, department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String obtainInfo() {
		String info = "Name: " + name +
				"\nEmail : " + email +
				"\nDepartment: " + department + "\n";
		
		return info;
	}
	
}
