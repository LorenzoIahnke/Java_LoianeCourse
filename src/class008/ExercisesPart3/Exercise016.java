package class008.ExercisesPart3;

public class Exercise016 {

	public static void main(String[] args) {
		int first = 1, second = 1, next = 0;
		System.out.println(first);
		System.out.println(second);
		while(next <= 500) {
			next = first+second;
			first = second;
			second = next;
			System.out.println(next);
		}
		

	}

}
