package class024;

public class Test {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,4,5,6,7,8,23,143};
		
		showValue(pares(numbers));
	}
	static void showValue(int num) {
		System.out.println(num);
	}
	
	static int pares(int[] array) {
		int cont = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2 == 0) {
				System.out.print(array[i] + " ");
				cont++;
			}
			
		}
		System.out.println();
		return cont;
	}
	
	
	
}
