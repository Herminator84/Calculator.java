
}
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum, secondNum;
        String operator;

        while (true) {
            System.out.print("Enter first number: ");
            firstNum = input.nextInt();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = input.next();

            System.out.print("Enter second number: ");
            secondNum = input.nextInt();

            double result;
            switch (operator) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    if (secondNum != 0) {
                        result = (double) firstNum / secondNum;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (y/n): ");
            String choice = input.next();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }
        }
        input.close();
    }
}
