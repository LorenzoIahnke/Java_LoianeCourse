package class033.Exercise001;

public abstract class GeometricFigure {
	private String name, colour;

	public GeometricFigure(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
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
	
	
	
}
