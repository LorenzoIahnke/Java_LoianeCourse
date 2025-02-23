package class020.PublicPrivate;

public class Car {
	String brand, colour;
	int wheels, doors;
	float fuelCapacity, fuelConsumption;

	public Car() {
	}

	public Car(String brand, String colour, int wheels, int doors, float fuelCapacity, float fuelConsumption) {
		this.brand = brand;
		this.colour = colour;
		this.wheels = wheels;
		this.doors = doors;
		this.fuelCapacity = fuelCapacity;
		this.fuelConsumption = fuelConsumption;
	}

	public Car(String brand, String colour, float fuelCapacity) {
		this.brand = brand;
		this.colour = colour;
		this.fuelCapacity = fuelCapacity;
	}

	public Car(String brand, String colour) {
		this("Ford", "Blue", 32);
	}

	void showAutonomy() {
		System.out.println("Autonomy is: " + fuelCapacity * fuelConsumption + "km");
	}

	float getAutonomy() {
		System.out.println("Get Autonomy Method arrived!");
		return fuelCapacity * fuelConsumption;
	}
	
	private double divideKmFuel(double km) {
		return km / fuelConsumption;
	}
	
	double getFuel(double km) {
		return this.divideKmFuel(km);
	}

}
