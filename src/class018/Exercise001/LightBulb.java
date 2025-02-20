package class018.Exercise001;

public class LightBulb {
	String brand;
	float potency, price;
	boolean on;
	
	void on() {
		on = true;
	}
	
	void off() {
		on = false;
	}
	
	void status() {
		if(on) {
			System.out.println("LightBulb is on");
		}else {
			System.out.println("LightBulb is off");
		}
	}
}
