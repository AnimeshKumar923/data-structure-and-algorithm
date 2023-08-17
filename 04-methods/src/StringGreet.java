import java.util.Scanner;

public class StringGreet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.next();

        String c = greet(name);

        System.out.println(c);
    }

    static String greet(String p) {
        String g = "Hello " + p + "!";
        return g;
    }
}
