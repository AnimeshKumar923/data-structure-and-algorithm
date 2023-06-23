import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 15, 45, 52, 36, 14, 84 };

        System.out.println("Enter element to search: ");
        int num = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Element " + num + " found at " + (i + 1) + " position in the array");
                break;
            }
        }
    }
}
