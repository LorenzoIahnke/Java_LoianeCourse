package class008.ExercisesPart3;

public class Exercise027 {

	public static void main(String[] args) {
		float value = 0.18f;
		for(int i = 1; i<=50; i++) {
			System.out.printf("\n" + i + " - $%.2f", (value*i));
		}
	}

}
