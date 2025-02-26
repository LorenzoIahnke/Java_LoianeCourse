package class033.Exercise001;

public class Main {

	public static void main(String[] args) {
		Square f1 = new Square("Square", "Red", 2);
		Circle f2 = new Circle("Circle", "Yellow", 2);
		Triangle f3 = new Triangle("Triangle", "Pink", 2, 3);
		Cube f4 = new Cube("Cube", "Orange", 3);
		Cylinder f5 = new Cylinder("Cylinder", "Blue", 2, 3);
		Pyramid f6 = new Pyramid("Pyramid", "Purple", 4, 4, 3, 2, f1);
		
		GeometricFigure[] figures = new GeometricFigure[6];
		figures[0] = f1;
		figures[1] = f2;
		figures[2] = f3;
		figures[3] = f4;
		figures[4] = f5;
		figures[5] = f6;
		
		for(GeometricFigure figure: figures) {
			System.out.println("--------------");
			System.out.println(figure.getName() + " " + figure.getColour());
			
			if(figure instanceof Figure2D) {
				Figure2D f2d = (Figure2D) figure;
				System.out.println(f2d.calculateArea());
			}
			
			if(figure instanceof Figure3D) {
				Figure3D f3d = (Figure3D) figure;
				System.out.println(f3d.calculateArea());
				System.out.println(f3d.calculateVolume());
			}
		}
		
		
	}

}
