import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 2, 5, 47, 85, 10 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 52;
        // if you make a change to the object via this reference variable, same object
        // will be changed.
    }
}
