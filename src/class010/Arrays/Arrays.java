package class010.Arrays;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperatures = new double[365];
		temperatures[0] = 31.3;
		temperatures[1] = 32;
		temperatures[2] = 33.7;
		temperatures[3] = 34;
		temperatures[4] = 31.1;
		
		System.out.println("Temperature Day 1: " + temperatures[0]);
		System.out.println("Temperature Day 2: " + temperatures[1]);
		System.out.println("Temperature Day 3: " + temperatures[2]);
		System.out.println("Temperature Day 4: " + temperatures[3]);
		System.out.println("Temperature Day 5: " + temperatures[4]);

		System.out.println("Array's size is: " + temperatures.length);
		
		System.out.println("Array's values: ");
		for(int i = 0; i<temperatures.length; i++) {
			System.out.println("Temperature Day " + (i+1) + " is " + temperatures[i]);
		}
		
		for(double temp : temperatures) {
			System.out.println(temp);
		}
	}

}
