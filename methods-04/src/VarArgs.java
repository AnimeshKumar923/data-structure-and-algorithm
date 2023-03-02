// variable length arguments

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 5, 448, 58, 61, 56);

        multiple(2, 74, "array", "String", "variable");
    }

    static void multiple(int a, int b, String... u) { // variable length arguments always at the end
        System.out.println(Arrays.toString(u));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}

// syntax for Variable Argument Length
/*
 * static void function_name(data_type ...variableName)
 */