package class012.ArraysPart2;

public class Arrays002 {

	public static void main(String[] args) {
		
		int[][][] array3Dimensions = new int [3][3][3];
		
		for(int i = 0; i<array3Dimensions.length; i++) {
			for(int j = 0; j<array3Dimensions[i].length; j++) {
				for(int k = 0; k<array3Dimensions[i][j].length; k++) {
					System.out.println("i = " + i + " | j = " + j + " | k = " + k);
					array3Dimensions[i][j][k] = i + j + k;
				}
			}
		}
		
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 0; i<array3Dimensions.length; i++) {
			for(int j = 0; j<array3Dimensions[i].length; j++) {
				for(int k = 0; k<array3Dimensions[i][j].length; k++) {
					sum += array3Dimensions[i][j][k];
					
					if(array3Dimensions[i][j][k] % 2 == 0) {
						evenSum += array3Dimensions[i][j][k];
					}else {
						oddSum += array3Dimensions[i][j][k];
					}
					
				}
			}
		}
		
		System.out.println("Total Sum: " + sum);
		System.out.println("Even Sum: " + evenSum);
		System.out.println("Odd Sum: " + oddSum);
	}

}
