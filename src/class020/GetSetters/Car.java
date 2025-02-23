package class020.GetSetters;

public class Car {
	private String brand, colour;
	private int wheels, doors;
	private double fuelCapacity; 
	private double fuelConsumption;
	
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

	double getAutonomy() {
		System.out.println("Get Autonomy Method arrived!");
		return fuelCapacity * fuelConsumption;
	}
	
	private double divideKmFuel(double km) {
		return km / this.fuelConsumption;
	}
	
	
	
	double getFuel(double km) {
		return this.divideKmFuel(km);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
	
	
	

}
