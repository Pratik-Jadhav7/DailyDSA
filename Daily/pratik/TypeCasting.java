package pratik;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num1 = input.nextInt();
//        System.out.println(num);

        // type Casting
        int num = (int)(552.355);
        System.out.println(num);

        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) (a); // 257 % 256 = 1;

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int + double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
