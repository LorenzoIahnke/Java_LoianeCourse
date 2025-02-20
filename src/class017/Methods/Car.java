package class017.Methods;

public class Car {
	String brand, colour;
	int wheels, doors;
	float fuelCapacity, fuelConsumption;
	
	void showAutonomy() {
		System.out.println("Autonomy is: " + fuelCapacity * fuelConsumption + "km");
	}
	
}
