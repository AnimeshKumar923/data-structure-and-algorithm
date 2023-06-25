import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of 1-D array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("smallest number in array " + Arrays.toString(arr) + " is " + max(arr));
    }

    static int max(int[] arr) {
        int min = arr[0]; // let minimum be arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
