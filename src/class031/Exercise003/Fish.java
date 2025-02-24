package class031.Exercise003;

public class Fish extends Animal{
	private String characteristics;

	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, String colour, String habitat, double size, int speed) {
		super(name, colour, habitat, size, speed);
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, String colour, String habitat, double size, int speed, String characteristics) {
		super(name, colour, habitat, size, speed);
		this.characteristics = characteristics;
		this.setPaws(0);
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCharacteristics: " + characteristics;
		return s;
	}
	
	
	
	
}
