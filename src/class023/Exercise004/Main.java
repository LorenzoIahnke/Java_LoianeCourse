package class023.Exercise004;

public class Main {

	public static void main(String[] args) {
		showValue(ConvertingVolumeUnits.galonToInch(1));
		showValue(ConvertingVolumeUnits.galonToLiter(3));
		showValue(ConvertingVolumeUnits.litersToCentimeters(2));
		showValue(ConvertingVolumeUnits.metersToFeet(4));
		showValue(ConvertingVolumeUnits.metersToLiters(3));
	}
	static void showValue(double num) {
		System.out.println(num);
	}

}
