package class021.Overloading;

public class Calculator {

	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public int sum(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	public int sum(int[] intArray) {
		int total = 0;
		
		for(int i=0; i<intArray.length; i++) {
			total += intArray[i];
		}
		return total;
	}
	
	public double sum(double num1, double num2) {
		return num1+num2;
	}
	
	public double sum(double num1,double num2,double num3) {
		return num1+num2+num3;
	}

	
}
