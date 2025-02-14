package class008.ExercisesPart3;

import java.util.Scanner;

public class Exercise003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = ""; // Inicializa name
        int age = 0; // Inicializa age
        double salary = 0.0; // Inicializa salary
        char sex = '\0'; // Inicializa sex com valor nulo
        boolean isValid = false;

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            if (name.length() <= 3) {
                System.out.println("Invalid! Name must have more than 3 letters.");
            } else {
                isValid = true;
                System.out.println("Hello, " + name + ", nice to meet you!");
            }
        } while (!isValid);

        isValid = false;

        do {
            System.out.println("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age < 0 || age > 150) {
                    System.out.println("Invalid! The interval is between 0 - 150.");
                } else {
                    isValid = true;
                    System.out.println("Hey, so you are " + age + " years old!");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for your age.");
                scanner.next();
            }
        } while (!isValid);

        isValid = false;

        do {
            System.out.println("Enter your salary: ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                if (salary <= 0) {
                    System.out.println("Invalid! Your salary must be above $0.00.");
                } else {
                    isValid = true;
                    System.out.println("Your salary is: $" + salary);
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for your salary.");
                scanner.next();
            }
        } while (!isValid);

        isValid = false;

        do {
            System.out.println("Enter your gender (F for Female or M for Male): ");
            if (scanner.hasNext()) {
                sex = scanner.next().charAt(0);
                if (sex != 'f' && sex != 'm' && sex != 'F' && sex != 'M') {
                    System.out.println("Invalid, you must write 'f' or 'm'");
                } else {
                    isValid = true;
                    System.out.println("Alright!");
                }
            } else {
                System.out.println("Invalid input!");
                scanner.next();
            }
        } while (!isValid);

        System.out.println("Your data information: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Gender: " + (sex == 'f' || sex == 'F' ? "Female" : "Male"));

        scanner.close();
    }
}
