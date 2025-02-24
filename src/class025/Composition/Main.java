package class025.Composition;

public class Main {

	public static void main(String[] args) {
		Contact c1 = new Contact();
		Address a1 = new Address();
		Phone p1 = new Phone();
		Phone p2 = new Phone();

		
		c1.setName("Lorenzo");
//		c1.setPhone("999999");
//		c1.setAddress("Street 1234");
		
		a1.setCity("Porto Alegre");
		a1.setCountry("Brazil");
		a1.setState("RS");
		a1.setName("Street Bla Bla");
		a1.setNumber("1234");
		
		p1.setType("CellPhone");
		p1.setAreaCode("55");
		p1.setNumber("9999999999");
		
		p2.setType("HomePhone");
		p2.setAreaCode("55");
		p2.setNumber("88888889");

		Phone[] phones = new Phone[2];
		phones[0] = p1;
		phones[1] = p2;
		
		c1.setAddress(a1);
		c1.setPhones(phones);
		System.out.println(c1.getName());
		
//		if(c1!=null  && c1.getPhone()!= null) {
//			System.out.println(c1.getPhone().getNumber());
//		}

		if(c1!=null && c1.getPhones()!=null) {
			for(Phone p: c1.getPhones()) {
				System.out.println(p.getAreaCode() + " " + p.getNumber());
			}
		}
		
//		System.out.println(c1.getAddress().getCity()); -- ERROR!
		if(c1!=null  && c1.getAddress()!= null) {
			System.out.println(c1.getAddress().getCity());
		}

	}

}
