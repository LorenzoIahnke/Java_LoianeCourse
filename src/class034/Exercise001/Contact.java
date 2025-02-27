package class034.Exercise001;

public class Contact {
	private String name, phoneNumber, email;
	private int id;
	private static int count = 0;
	
	public Contact() {
		count++;
		id = count;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		String s = "";
		s += "\nId: " + id;
		s += "\nName: " + name;
		s += "\nEmail: " + email;
		s += "\nPhone Number: " + phoneNumber;
		
		return s;
	}

	
	
}
