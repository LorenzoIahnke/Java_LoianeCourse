package class022.Exercise001;

public class LightBulb {
	private String brand;
	private float potency, price;
	private boolean on;

	
	//Constructor
	public LightBulb() {}
	
	public LightBulb(String brand, float potency, float price, boolean on) {
		super();
		this.brand = brand;
		this.potency = potency;
		this.price = price;
		this.on = on;
	}

	
	//Getters and Setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPotency() {
		return potency;
	}

	public void setPotency(float potency) {
		this.potency = potency;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	private boolean isOn() {
		return on;
	}

	private void setOn(boolean on) {
		this.on = on;
	}

	//Methods
	private void on() {
		setOn(true);
	}
	
	private void off() {
		setOn(false);
	}
	
	public void status() {
		if(isOn()) {
			System.out.println("LightBulb is on");
		}else {
			System.out.println("LightBulb is off");
		}
	}
	
	public void changeStatus() {
		if(isOn()) {
			off();
		}else {
			on();
		}
	}


}
