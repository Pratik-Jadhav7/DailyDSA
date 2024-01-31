package pratik;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float int1 = input.nextFloat();
        float int2 = input.nextFloat();

        float sum = int1 + int2;

        System.out.println("Sum = " + sum);
    }
}
