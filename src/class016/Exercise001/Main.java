package class016.Exercise001;

public class Main {

	public static void main(String[] args) {
		LightBulb l = new LightBulb();
		l.brand = "Something";
		l.potency = 1200;
		l.price = 12.5f;
		
		System.out.println(l.brand + " - " + l.potency + " - $" + l.price);
	}

}
