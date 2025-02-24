package class030.ObjectClass;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.setCourse("Coding");
		double[] grades = {10, 9, 9, 8};
		s.setGrades(grades);
		System.out.println(s);
		
		String s1 = "afafdas";
		String s2 = "afafdaS";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Student st2 = new Student();
		st2.setCourse("Coding");
		double[] grades2 = {10, 9, 9, 8};
		st2.setGrades(grades2);
		
		System.out.println(s1.equals(st2));

	}

}
