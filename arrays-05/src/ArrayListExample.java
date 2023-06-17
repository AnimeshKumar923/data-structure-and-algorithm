import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(125);
        list.add(545);
        list.add(5610);

        System.out.println(list.contains(55152)); // 'list.contains()' checks whether
        // array contains the passed number
        // or not. Returns a True/False value.

        System.out.println(list.contains(125));

        System.out.println(list);
        list.set(2, 0); // 'list.set(n,b)' sets/changes the nth index value to b.

        System.out.println(list);

        list.remove(3); // list.remove(n) removes the nth index from the array itself
        // altogether.

        System.out.println(list);

        // taking input through loop

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
