package class033.Exercise001;

public class Pyramid extends Figure3D{
	private double apothem, polygons, height, edge;
	private Figure2D base;
	
	public Pyramid(String name, String colour, double apothem, double polygons, double height, double edge,
			Figure2D base) {
		super(name, colour);
		this.apothem = apothem;
		this.polygons = polygons;
		this.height = height;
		this.edge = edge;
		this.base = base;
	}

	public double getApothem() {
		return apothem;
	}

	public void setApothem(double apothem) {
		this.apothem = apothem;
	}

	public double getPolygons() {
		return polygons;
	}

	public void setPolygons(double polygons) {
		this.polygons = polygons;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	public Figure2D getBase() {
		return base;
	}

	public void setBase(Figure2D base) {
		this.base = base;
	}

	@Override
	public double calculateVolume() {
		if(base!=null) {
			return (base.calculateArea()*height)/3;
		}
		return 0;
	}

	@Override
	public double calculateArea() {
		if(base != null) {
			return (polygons *((edge*apothem)/2)) + base.calculateArea();
		}
		return 0;
	}
	
	
	
}
