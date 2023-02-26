import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 10;
        int b = 40;

        // System.out.println(marks); // you cannot access this variable "marks" since
        // it
        // is not inside this function, even if it is in the parameter of another
        // function.
    }

    // scoping simply means that you can only access those variables which are
    // currently inside the function.

    // you cannot access a variable from function 1 in function 2.

    static void random(int marks) {
        // System.out.println(a); // you cannot access this variable "a" since it is not
        // inside this function.
    }
}
