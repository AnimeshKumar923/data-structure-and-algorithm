import java.util.Scanner;

public class SwapFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 10;
        int b = 50;

        swap(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

// does not swap because of pass by value (copy of the value).
// original value of a & b remains unchanged.
