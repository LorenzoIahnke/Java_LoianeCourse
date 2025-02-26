package class033.Exercise001;

public class Cylinder extends Figure3D{
	private double radius, height;

	public Cylinder(String name, String colour, double radius, double height) {
		super(name, colour);
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateVolume() {
		
		return Math.PI + (radius*radius) * height;
	}

	@Override
	public double calculateArea() {
		double baseArea = (radius*radius) * Math.PI;
		double lateralArea = 2*Math.PI*radius*height;
		double totalArea = (2*baseArea) + lateralArea;
		return totalArea;
	}
	
	
}
