package class020.PublicPrivate;

public class MainCar {

	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "Ford";
		System.out.println(car.brand);
		car.getFuel(250);
		System.out.println(car.getFuel(250));
		
	}

}
