package class015.Class;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "Ford";
		car.colour = "Black";
		car.doors = 4;
		car.wheels = 4;
		
		System.out.println(car.brand + " - " + car.colour);
		
		Car car2 = new Car();
		car2.brand = "Fiat";
		car2.colour = "Yellow";
		
		System.out.println(car2.brand + " - " + car2.colour);
	}

}
