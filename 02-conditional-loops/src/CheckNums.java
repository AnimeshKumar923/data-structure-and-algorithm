import java.util.Scanner;

public class CheckNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.print("Enter the number to search: ");
        int a = input.nextInt();

        int count = 0;

        while (n > 0) {
            int rem;
            rem = n % 10;
            if (rem == a) {
                count++;
            }
            n = n / 10;
        }
        System.out.print("number of times " + a + " appeared = " + count);
    }
}
