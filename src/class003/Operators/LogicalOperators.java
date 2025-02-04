package class003.Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int var1 = 1;
		int var2 = 2;
		
		boolean result1 = (var1 == 1)&&(var2 == 2);
		System.out.println("var1 is 1 AND var2 is 2: " + result1);
		
		boolean result2 = (var1 == 1)||(var2 == 2);
		System.out.println("var1 is 1 OR var2 is 2: " + result2);

	}

}
