import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CalcPro");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Enter Choice: ");
        int choice = input.nextInt();
        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();
        int result = 0;
        if (choice == 1)
        {
            result = number1 + number2;
        }
        if (choice == 2)
        {
            result = number1 - number2;
        }
        if (choice == 3)
        {
            result = number1 * number2;
        }
        if (choice == 4)
        {
            result = number1 / number2;
        }
        System.out.println("Result = " + result);
    }
}