package class031.Exercise003;

public class Animal {
	protected String name, colour, habitat;
	protected double size, speed;
	protected int paws;
	
	public Animal() {
		this.paws = 4;
	}

	public Animal(String name, String colour, String habitat, double size, double speed) {
		super();
		this.name = name;
		this.colour = colour;
		this.habitat = habitat;
		this.size = size;
		this.paws = 4;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getPaws() {
		return paws;
	}

	public void setPaws(int paws) {
		this.paws = paws;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Animal"
				+ "\nName: " + name + 
				"\nColour: " + colour + 
				"\nHabitat: " + habitat + 
				"\nSize: " + size + 
				"\nPaws: " + paws + 
				"\nSpeed: " + speed + "m/s";
	}
	
	
	
}
