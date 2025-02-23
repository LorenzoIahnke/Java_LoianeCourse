package class023.Exercise001;

public class Counter {
	private static int counter;
	
	public Counter() {
		counter++;
	}
	
	public static void increment() {
		counter++;
	}
	
	public static void reset() {
		counter = 0;
	}
	
	public static int showCounter() {
		return counter;
	}
}
