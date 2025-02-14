 package class007.Loops;

public class LoopFor {

	public static void main(String[] args) {
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
		
		for(int j = 10; j>=0; j--) {
			System.out.println(j);
		}
		
		for(int i = 0, j=10; i<=j;i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
		int count = 0;
		for(;count < 10;) {
			System.out.println(count);
			count+=2;
		}
		
		int sum = 0;
		for(int i = 1; i<5; sum += i++);
		System.out.println(sum);
			
		
	}

}
