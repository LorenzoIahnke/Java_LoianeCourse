package class012.ArraysPart2;

public class Arrays001 {

	public static void main(String[] args) {
		double[][] studentsGrade = new double[3][4];

		studentsGrade[0][0] = 10;
		studentsGrade[0][1] = 7;
		studentsGrade[0][2] = 9;
		studentsGrade[0][3] = 9.5;

		studentsGrade[1][0] = 9;
		studentsGrade[1][1] = 8;
		studentsGrade[1][2] = 7;
		studentsGrade[1][3] = 9;

		studentsGrade[2][0] = 8;
		studentsGrade[2][1] = 9;
		studentsGrade[2][2] = 10;
		studentsGrade[2][3] = 7;

		for (int i = 0; i < studentsGrade.length; i++) {
			for (int j = 0; j < studentsGrade[i].length; j++) {
				System.out.print(studentsGrade[i][j] + " | ");
			}
			System.out.println();
		}

		studentsGrade[1][3] = 8;
		System.out.println();

		for (int i = 0; i < studentsGrade.length; i++) {
			for (int j = 0; j < studentsGrade[i].length; j++) {
				System.out.print(studentsGrade[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Calculating average for each student: ");
		double sum;
		for (int i = 0; i < studentsGrade.length; i++) {
			sum = 0;
			for (int j = 0; j < studentsGrade[i].length; j++) {
				sum += studentsGrade[i][j];
			}
			System.out.println("Average student " + i + " is: " + (sum / 4));
		}

		double[][] grades2 = { { 7, 8, 9, 10 }, { 7, 6, 5, 4 } };
		System.out.println("New Output: ");
		System.out.println();
		for (int i = 0; i < grades2.length; i++) {
			for (int j = 0; j < grades2[i].length; j++) {
				System.out.print(grades2[i][j] + " | ");
			}
			System.out.println();
		}

	}

}
