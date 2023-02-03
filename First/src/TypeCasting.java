import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        converting float into an integer
//        typecasting
        int num = (int) (58.65f);
        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a*b)/c; // during arithmetic calculations, the byte format is automatically converted into integer for the calculations hence the result here is '20'

        System.out.println(d);


        System.out.println("नमस्ते"); // Java follows unicode

        int letter = 'A';
        System.out.println(letter);
    }
}
