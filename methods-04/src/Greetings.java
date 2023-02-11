import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        greet();

    }

    static void greet() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello There " + name + "!");

    }
}
