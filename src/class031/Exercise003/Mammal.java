package class031.Exercise003;

public class Mammal extends Animal{
	private String foodType;

	public Mammal(String name, String colour, String habitat, double size, double speed, String foodType) {
		super(name, colour, habitat, size, speed);
		this.foodType = foodType;
		this.setPaws(4);
	}
	

	public Mammal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mammal(String name, String colour, String habitat, double size, int speed) {
		super(name, colour, habitat, size, speed);
		// TODO Auto-generated constructor stub
	}



	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nFood Type: " + foodType;
		return s;
	}
	
	
	
	
	
}
