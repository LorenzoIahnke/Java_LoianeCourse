package class006.ExercisesPart2;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type 3 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int[] numbers = {num1, num2, num3};
        
        Arrays.sort(numbers);
        
        System.out.println(numbers[0] + " - " + numbers[1] + " - " + numbers[2]);
        
        scanner.close();
    }
}
