package class033.Exercise001;

public class Triangle extends Figure2D{
	private double height, base;

	public Triangle(String name, String colour, double height, double base) {
		super(name, colour);
		this.height = height;
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (base*height)/2;
	}
	
	
}
