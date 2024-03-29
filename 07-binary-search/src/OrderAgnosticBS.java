public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int[] arr = { 100, 58, 45, 25, 12, 0, -14, -17, -84 };
        int target = 100;
        int ans = orderAgnosticBS(arr, target);

        if (ans > -1) {
            System.out.println("Element found at " + (ans + 1) + "th position");

        } else {
            System.out.println("Element not found!");
        }
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order

        boolean isAsc;

        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
