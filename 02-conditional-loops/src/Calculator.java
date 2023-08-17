import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take input from user till user does not press x or X

        float ans = 0;
        while (true) {
            // take operator as input
            System.out.println("Enter the operator or press x/X to exit: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                Float num1 = input.nextFloat();
                Float num2 = input.nextFloat();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Denominator cannot be zero!");
                    }

                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!!\nEnter a valid operator");
            }

            System.out.println("Result is: " + ans);
        }
    }
}
