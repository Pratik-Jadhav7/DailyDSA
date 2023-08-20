import java.util.Arrays;
import java.util.Scanner;

public class ColNoFixed {
    public static void main(String[] args) {

        /*
        like below matrix
        { 1 2 3 4
          6 7
          8 9 10 }

          not fixed column
         */

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//                Normal Output

                for(int row = 0; row < arr.length; row++){
                    for(int col = 0; col < arr[row].length; col++){
                        System.out.print(arr[row][col] + " ");
                    }
                    System.out.println();
        }

//                Method 2

            for(int[] a : arr){
                System.out.println(Arrays.toString(a));
            }
    }
}
