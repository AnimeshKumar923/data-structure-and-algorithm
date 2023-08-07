import java.util.Arrays;
import java.util.Scanner;

public class Searchin2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array row:");
        int r = in.nextInt();
        System.out.print("Enter array column: ");
        int c = in.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter array elements");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("Enter element to search: ");
        int num = in.nextInt();

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (num == arr[row][col]) {
                    System.out.println(
                            "Element " + num + " found at index " + "[" + (row + 1) + "]" + "[" + (col + 1) + "]");
                    break;

                }
            }
        }
    }
}
