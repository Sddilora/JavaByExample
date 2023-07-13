import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ifCalculator();
        switchCalculator();
        scanner.close();
    }

    public static void ifCalculator (){

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the next line (clears the buffer)

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the next line (clears the buffer)

        System.out.println("What operation do you want to perform? (summation, subtraction, multiplication, division)");
        String operation = scanner.nextLine();

        if (operation.equals("summation")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("subtraction")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        } else if (operation.equals("multiplication")) {
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        } else if (operation.equals("division")) {
            if (number2 == 0) {
                System.out.println("Division by zero is not allowed");
                System.exit(0);
            }
            System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        } else {
            System.out.println("Invalid operation");
        }

    }

    public static void switchCalculator(){

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the next line (clears the buffer)

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the next line (clears the buffer)

        System.out.println("What operation do you want to perform? (summation, subtraction, multiplication, division)");
        String operation = scanner.nextLine();

        switch (operation) {
            case "summation":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "subtraction":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "multiplication":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "division":
                if (number2 == 0) {
                    System.out.println("Division by zero is not allowed");
                    System.exit(0);
                }
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

    }
}
