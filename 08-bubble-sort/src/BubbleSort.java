import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("\n\nSorted array:");

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    flag = 1;
                }

            }

            if (flag == 0) {
                break;
            }

        }

        // System.out.print("\n\nSorted array = ");
        // for (int i = 0; i < size; i++) {
        // System.out.print(arr[i] + " ");

        // }

    }

}
