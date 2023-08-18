import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size=in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements: ");
        for (int i=0; i<size; i++){
            arr[i]=in.nextInt();
        }


        insertion(arr);
        System.out.println("\n\nSorted array:\n");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}

