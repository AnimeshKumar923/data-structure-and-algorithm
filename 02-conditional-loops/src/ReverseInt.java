import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        while (n > 0) {
            int rem;
            rem = n % 10;
            n = n / 10;
            System.out.print(rem);
        }
    }
}
