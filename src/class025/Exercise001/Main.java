package class025.Exercise001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the your schedule's name: ");
		String name = scanner.nextLine();
		Schedule s1 = new Schedule(name);
		
		Contact[] contacts = new Contact[3];
		for(int i = 0; i<contacts.length; i++) {
			System.out.println("Enter the information for person " + (i+1) + ": ");
			Contact c = new Contact();
			
			System.out.println("Enter Name: ");
			name = scanner.nextLine();
			c.setName(name);
			
			System.out.println("Enter Phone: ");
			String phone = scanner.nextLine();
			c.setPhone(phone);
			
			System.out.println("Enter Email: ");
			String email = scanner.nextLine();
			c.setEmail(email);
			
			contacts[i] = c;
		}
		
		s1.setContact(contacts);
		
		if(s1 != null) {
			System.out.println(s1.obtainInfo());
		}
		
		scanner.close();
		
		
	}

}
