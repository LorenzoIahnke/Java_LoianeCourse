package class034.Exceptions;

public class Exceptions {
	public static void main(String[] args) {
		try {
		int[] vector = new int[4];
		System.out.println("Before Exception");
		
		vector[4] = 1; //ERROR
		
		System.out.println("This text won't be showed!");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Error trying to access the position of the vector");
		}
		System.out.println("After Exception");
	}
}
