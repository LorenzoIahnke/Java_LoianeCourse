package class023.Exercise001;

public class MainCounter {

	public static void value() {
		System.out.println(Counter.showCounter());
	}
	public static void main(String[] args) {
		Counter.increment();
		value();
		Counter.reset();
		value();
		Counter c = new Counter();
		Counter.increment();
		value();
		System.out.println(c);
	}

}
