package class017.MethodsPart3;

public class Car {
	String brand, colour;
	int wheels, doors;
	float fuelCapacity, fuelConsumption;
	
	void showAutonomy() {
		System.out.println("Autonomy is: " + fuelCapacity * fuelConsumption + "km");
	}
	
	float getAutonomy() {
		System.out.println("Get Autonomy Method arrived!");
		return fuelCapacity * fuelConsumption;
	}

	double getFuel(double km) {
		double amountFuel = km/fuelConsumption;
		return amountFuel;
	}
	
}
