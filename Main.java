import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int calculationCount = 0;
        double lastResult = 0;
        double highestResult = Double.MIN_VALUE;

        boolean running = true;

        while (running) {

            System.out.println("\n===== CalcPro =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = input.nextInt();

            if (choice == 5) {

                System.out.println("\n===== Session Summary =====");
                System.out.println("Total Calculations = " + calculationCount);

                if (calculationCount > 0) {
                    System.out.println("Last Result = " + lastResult);
                    System.out.println("Highest Result = " + highestResult);
                }

                System.out.println("Thank you for using CalcPro!");
                running = false;
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice!");
                continue;
            }

            System.out.print("Enter First Number: ");
            double number1 = input.nextDouble();

            System.out.print("Enter Second Number: ");
            double number2 = input.nextDouble();

            double result = 0;

            if (choice == 1) {
                result = number1 + number2;
            }

            if (choice == 2) {
                result = number1 - number2;
            }

            if (choice == 3) {
                result = number1 * number2;
            }

            if (choice == 4) {

                if (number2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    continue;
                }

                result = number1 / number2;
            }

            calculationCount++;

            lastResult = result;

            if (result > highestResult) {
                highestResult = result;
            }

            System.out.println("Result = " + result);
            System.out.println("Calculation Completed");
            System.out.println("Last Result = " + lastResult);
            System.out.println("Highest Result = " + highestResult);
            System.out.println("Total Calculations = " + calculationCount);
        }

        input.close();
    }
}