import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter first number: ");
        int b = in.nextInt();

        int c = sum(a, b); // a and b are arguments being passed into the function sum

        System.out.println("Sum = " + c);
    }

    static int sum(int first, int second) {
        int sum = 0;
        sum = first + second;
        return sum;
    }
}
