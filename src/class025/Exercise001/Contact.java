package class025.Exercise001;

public class Contact {
	private String name, phone, email;
	
	public Contact() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String obtainInfo() {
		return "Name: " + name + 
				"\nPhone: " + phone + 
				"\nEmail: " + email + "\n----------------------\n";
	}
	
	
}
