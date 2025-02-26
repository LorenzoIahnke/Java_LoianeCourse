package class032.Upcasting.Downcasting;

public class Test {
	public static void main (String[] args) {
//		Student s = new Student();
//		Person p = s; //upcasting
//		
//		Person s2 = (Person) new Student();
//		
//		Person s3 = new Person();
//		Student s4 = (Student) s3;
//		
		Person p = new Person();
		Student s = new Student();
		Teacher t = new Teacher();
		
		if(p instanceof Person) {
			System.out.println("Is a Person!");
		}
		if(s instanceof Student) {
			System.out.println("Is a Student!");
		}
		if(t instanceof Teacher) {
			System.out.println("Is a Teacher!");
		}
	}
}
