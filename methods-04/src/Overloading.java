import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        fun(85);
        fun("animesh");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}

/*
 * when two function have same name and same return-type but different
 * arguments.
 * 
 * At compile time, it decides which function to choose according to the
 * data-type in argument of the function.
 * 
 * Two conditions for Overloading:
 * 1) either the number of arguments should be different.
 * 2) or the type of arguments should be different.
 */