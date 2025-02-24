package class025.Composition;

public class Contact {
	private String name;
	private Phone[] phones;
	private Address address;

	public Contact() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	
	
}
