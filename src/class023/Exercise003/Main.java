package class023.Exercise003;

public class Main {

	public static void main(String[] args) {
		showValue(ConvertingAreaUnits.acresToFeet(29));
		showValue(ConvertingAreaUnits.metersToFeet(1200));
		showValue(ConvertingAreaUnits.feetToCentimeters(540));
	}
	static void showValue(double num) {
		System.out.println(num);
	}
}
