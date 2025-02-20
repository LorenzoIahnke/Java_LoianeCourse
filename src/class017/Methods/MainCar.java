package class017.Methods;


public class MainCar {

	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "Ford";
		car.colour = "Black";
		car.doors = 4;
		car.wheels = 4;
		car.fuelCapacity = 100;
		car.fuelConsumption = 0.2f;
		
		System.out.println(car.brand + " - " + car.colour);
		car.showAutonomy();

	}

}
