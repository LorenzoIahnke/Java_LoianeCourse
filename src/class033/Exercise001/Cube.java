package class033.Exercise001;

public class Cube extends Figure3D{
	private double side;

	public Cube(String name, String colour, double side) {
		super(name, colour);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return side*side*side;
	}

	@Override
	public double calculateArea() {
		return 6*(side*side);
	}
	
	
}
