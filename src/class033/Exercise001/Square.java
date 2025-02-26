package class033.Exercise001;

public class Square extends Figure2D{
	private double side;

	public Square(String name, String colour, double side) {
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
	public double calculateArea() {
		return side * side;
	}
	
	
}
