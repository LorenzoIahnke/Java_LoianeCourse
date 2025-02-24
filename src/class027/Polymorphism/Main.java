package class027.Polymorphism;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		Person s = new Student();
		Person t = new Teacher();
		
		p.setAddress("Street 1, num 1");
		s.setAddress("Street 2, num 2");
		t.setAddress("Street 3, num 3");
		
		System.out.println(p.getAddressMethod());
		System.out.println(s.getAddressMethod());
		System.out.println(t.getAddressMethod());

	}

}
