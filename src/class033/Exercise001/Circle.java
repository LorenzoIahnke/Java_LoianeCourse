package class033.Exercise001;

public class Circle extends Figure2D{
	private double radius;

	public Circle(String name, String colour, double radius) {
		super(name, colour);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (radius*radius) * Math.PI;
	}
	
	

}
