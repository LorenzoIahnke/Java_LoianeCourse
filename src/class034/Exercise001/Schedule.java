package class034.Exercise001;

public class Schedule {
	private Contact[] contacts;
	
	public Schedule() {
		contacts = new Contact[5];
	}
	
	public void addContact(Contact c) throws FullScheduleException{
		
		boolean full = true;
		for(int i = 0; i<contacts.length; i++) {
			if(contacts[i] == null) {
				contacts[i] = c;
				full = false;
				break;
			}
		}
		if(full) {
			throw new FullScheduleException();
		}
	}
	
	public int checkContact(String name) throws NoContactException {
		for(int i = 0; i<contacts.length; i++) {
			if(contacts[i]!= null) {
				if(contacts[i].getName().equalsIgnoreCase(name)) {
					return i;
				}
			}
		}
		
		throw new NoContactException(name);
	}
	
	@Override
	public String toString() {
		String s = "";
		for(Contact c: contacts) {
			if(c!= null) {
			s += c.toString() + "\n";
			}
		}
		return s;
	}
	
	
}
