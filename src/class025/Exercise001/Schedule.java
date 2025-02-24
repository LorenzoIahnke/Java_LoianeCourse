package class025.Exercise001;

public class Schedule {
	private String name;
	private Contact[] contacts;

	public Schedule() {
	}

	public Schedule(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact[] getContact() {
		return contacts;
	}

	public void setContact(Contact[] contact) {
		this.contacts = contact;
	}

	public String obtainInfo() {
		String info = "Schedule: " + name + "\n";
		if (contacts != null) {
			for (Contact c : contacts) {
				info += c.obtainInfo();
			}
		}

		return info;
	}

}
