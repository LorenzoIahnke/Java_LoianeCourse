package class008.ExercisesPart3;

public class Exercise004 {

	public static void main(String[] args) {
		float popA=80000, popB=200000;
		int cont = 0;
		while(popA < popB) {
			popA = popA + ((popA*3)/100);
			popB = popB + (popB/100) * 1.5f;
			cont++;
		}
		System.out.println(popA);
		System.out.println(popB);
		System.out.println(cont);
		
	}

}
