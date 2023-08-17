import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q: Find the largest of the 3 numbers

        // method 1:

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        // int max = a;

        // if (b > max) {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }

        // System.out.println(max);

        // method 2:

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}
